package tripsearchengine;

// This mock object simulates a FlightTripI that has the following features:
//	departureLocation = "London";
//	destinationLocation = "�sland";
//	returnLocation = "London";
//	flightClass = "firstClass";

public class MockFlightTrip implements FlightTripI {
	private String departureLocation;
	private String destinationLocation;
	private String returnLocation;
	private String flightClass;
	
	public MockFlightTrip() {
		this.departureLocation = "London";
		this.destinationLocation = "�sland";
		this.returnLocation = "London";
		this.flightClass = "firstClass";
	}

	
	public String getDepartureLocation() {
		
		return this.departureLocation;
	}
	
	
}
