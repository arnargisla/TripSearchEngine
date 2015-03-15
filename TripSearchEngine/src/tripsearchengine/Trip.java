package tripsearchengine;

public class Trip {
	// �essi klasi er tilb�inn, held �g
	
	private FlightTripI flightTrip;
	private HotelStayI hotelStay;
	
	public Trip(FlightTripI flightTrip, HotelStayI hotelStay) {
		this.flightTrip = flightTrip;
		this.hotelStay = hotelStay;
	}
	
	public FlightTripI getFlightTrip(){
		return flightTrip;
	}
	
	public HotelStayI getHotelStay(){
		return hotelStay;
	}
	
}
