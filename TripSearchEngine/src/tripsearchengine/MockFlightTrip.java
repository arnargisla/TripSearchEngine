package tripsearchengine;

public class MockFlightTrip implements FlightTripI {
	private String departureLocation;
	private String destinationLocation;
	private String returnLocation;
	private String flightClass;
	
	public MockFlightTrip() {
		this.departureLocation = "London";
		this.destinationLocation = "Ísland";
		this.returnLocation = "London";
		this.flightClass = "firstClass";
	}

	
	public String getDepartureLocation() {
		
		return this.departureLocation;
	}
	
	
}
