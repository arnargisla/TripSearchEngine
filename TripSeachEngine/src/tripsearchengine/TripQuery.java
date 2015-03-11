package tripsearchengine;

public class TripQuery {
	private String departureLocation;
	private String destinationLocation;
	private String returnLocation;
	private Date departureDate;
	private Date returnDate;
	private int minPrice;
	private maxPrice;
	private double stopoverDuration;
	private double layoverDuration;
	private String flightClass;
	
	public TripQuery() {
	
	}
	
	public Trip[] executeQuery() {
		FlightTrip[] flightTrips = queryFlight();
		HotelStay[] hotelStay = queryHotels();
		
	}
	
	private FlightTrip[] queryFlight() {
		FlightQuery flightQuery = new FlightQuery();
		flightQuery.setDepartureDate(this.departureDate);
		// ...
		return flightQuery.executeQuery();
	}
	
	private HotelStay[] queryHotel() {
		
	}
	
	public setDepartureLocation(String departureLocation) {
		
	}
	
	public setDestinationLocation(String destinationLocation) {
		
	}
	
	public setReturnLocation(String returnLocation) {
		
	}
	
	public setDepartureDate(Date departureDate) {
		
	}
	
	public setReturnDate(Date returnDate) {
		
	}
	
	public setMinPrice(int minPrice) {
		
	}
	
	public setMaxPrice(int maxPrice) {

	}
	
	public setFlightClass(String flightClass) {
		
	}
}	