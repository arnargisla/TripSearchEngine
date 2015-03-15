package tripsearchengine;

public class Trip {

	private FlightTripI flightTrip;
	private HotelStayI hotelStay;
	
	public Trip(FlightTripI flightTrip, HotelStayI hotelStay) {
		this.flightTrip = flightTrip;
		this.hotelStay = hotelStay;
	}
	
	public String getDepartureLocation() {
		return flightTrip.getDepartureLocation();
		
	}
}
