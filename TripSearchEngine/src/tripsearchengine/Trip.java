package tripsearchengine;

public class Trip {
	// Þessi klasi er tilbúinn, held ég
	
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
