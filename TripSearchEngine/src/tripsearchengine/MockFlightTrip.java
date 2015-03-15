package tripsearchengine;

public class MockFlightTrip implements FlightTripI {
	public String departureLocation;
	public String destinationLocation;
	public String returnLocation;
	
	public MockFlightTrip() {
		this.departureLocation = "London";
		this.destinationLocation = "Ísland";
		this.returnLocation = "London";
	}

	
	public String getDepartureLocation() {
		
		return this.departureLocation;
	}
	
	
}
