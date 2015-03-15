package tripsearchengine;

import java.util.Date;
import java.util.ArrayList;

public class TripQuery {
	private String departureLocation;
	private String destinationLocation;
	private String returnLocation;
	private Date departureDate;
	private Date returnDate;
	private int minPrice;
	private int maxPrice;
	private double stopoverDuration;
	private double layoverDuration;
	private String flightClass;
	
	private FlightQueryI flightQuery;
	private HotelQueryI hotelQuery;
	
	public TripQuery(FlightQueryI flightQuery, HotelQueryI hotelQuery) {
		this.flightQuery = flightQuery;
		this.hotelQuery = hotelQuery;
	}
	
	public ArrayList<Trip> executeQuery() {
		ArrayList<Trip> tripList = new ArrayList<Trip>();
		FlightTripI[] flightTrip = queryFlight();
		HotelStayI[] hotelStay = queryHotel();
		
		// Creates all combinations of flights and hotels
		// with no filtering
		for(int i=0; i<flightTrip.length; i++){
			for(int j=0; j<hotelStay.length; j++){
				tripList.add(new Trip(flightTrip[i], hotelStay[j]));
			}
		}
		
		return tripList;
	}
	
	private FlightTripI[] queryFlight() {
		
		
		//flightQuery.setDepartureDate(this.departureDate);
		//flightQuery.setReturnDate(this.returnDate);
		flightQuery.setDepartureLocation(this.departureLocation);
		flightQuery.setReturnLocation(this.returnLocation);
		flightQuery.setDestinationLocation(this.destinationLocation);
		//flightQuery.setMinPrice(this.minPrice);
		//flightQuery.setMaxPrice(this.maxPrice);
		//flightQuery.setStopoverDuration(this.stopoverDuration);
	    //flightQuery.setLayoverDuration(this.layoverDuration);
		//flightQuery.setFlightClass(this.flightClass);
		FlightTripI[] flightTrip = flightQuery.executeQuery();
		return flightTrip;
	}
	
	private HotelStayI[] queryHotel() {
		
		HotelStayI[] hotelTrip = hotelQuery.executeQuery();
		return hotelTrip;
	}
	
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
		
	}
	
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	
	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}
	
	public void  setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
}	