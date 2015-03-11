package tripsearchengine;

import java.util.Date;

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
	
	public TripQuery() {
	
	}
	
	public Trip[] executeQuery() {
		Trip[] trip = new Trip[15];
		FlightTrip[] flightTrip = queryFlight();
		HotelStay[] hotelStay = queryHotel();
		int i = 0;
		while(hotelStay[i] != null && flightTrip[i] != null) {
			trip[i] = new Trip(flightTrip[i], hotelStay[i] );
			
		}
		
		
		
		return trip;
	}
	
	private FlightTrip[] queryFlight() {
		
		FlightQuery flightQuery = new FlightQuery();
		//flightQuery.setDepartureDate(this.departureDate);
		//flightQuery.setReturnDate(this.returnDate);
		flightQuery.setDepartureLocation(this.departureLocation);
		flightQuery.setReturnLocation(this.returnLocation);
		flightQuery.setDestinationLocation(this.destinationLocation);
		//flightQuery.setMinPrice(this.minPrice);
		//flightQuery.setMaxPrice(this.maxPrice);
		//flightQuery.setStopoverDuration(this.stopoverDuration);
	//	flightQuery.setLayoverDuration(this.layoverDuration);
		//flightQuery.setFlightClass(this.flightClass);
		FlightTrip[] flightTrip = flightQuery.executeQuery();
		return flightTrip;
	}
	
	private HotelStay[] queryHotel() {
		return null;
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