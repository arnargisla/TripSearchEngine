package tripsearchengine;

public class Trip {

	private FlightTrip flightTrip;
	private HotelStay hotelStay;
	
	public Trip(FlightTrip flightTrip, HotelStay hotelStay) {
		this.flightTrip = flightTrip;
		this.hotelStay = hotelStay;
	}
	
	public String getDepartureLocation() {
		return flightTrip.departureLocation;
		
	}
}
