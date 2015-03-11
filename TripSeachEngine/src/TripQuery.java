
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
		
	}
	
	private FlightTrip[] queryFlight() {
		String[] Flighttrip = getFlights(parameters);
		return Flighttrip;
	}
	
	private HotelStay[] queryHotel() {
		
	}
	
	public setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
		
	}
	
	public setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	
	public setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}
	
	public setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	
	public setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	
	public setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	public setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
}	