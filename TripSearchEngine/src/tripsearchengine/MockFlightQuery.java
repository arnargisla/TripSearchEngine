package tripsearchengine;

import java.util.Date;

// This mock object simulates a flightQuery that returns two 
// MockFlightTripI's

public class MockFlightQuery implements FlightQueryI {

	public FlightTripI[] executeQuery(){
		FlightTripI[] result = new MockFlightTrip[2];
		FlightTripI a = new MockFlightTrip();
		result[0] = a;
		result[1] = a;
		return result;		
	}
	
	public void setDepartureDate(Date departureDate) {
		// TODO Auto-generated method stub
	}

	public void setReturnDate(Date returnDate) {
		// TODO Auto-generated method stub
		
	}

	public void setDepartureLocation(String departureLocation) {
		// TODO Auto-generated method stub
		
	}

	public void setReturnLocation(String returnLocation) {
		// TODO Auto-generated method stub
		
	}

	public void setDestinationLocation(String destinationLocation) {
		// TODO Auto-generated method stub
		
	}

	public void setMinPrice(int minPrice) {
		// TODO Auto-generated method stub
		
	}

	public void setMaxPrice(int maxPrice) {
		// TODO Auto-generated method stub
		
	}

	public void setStopoverDuration(double stopoverDuration) {
		// TODO Auto-generated method stub
		
	}

	public void setLayoverDuration(double layoverDuration) {
		// TODO Auto-generated method stub
		
	}

	public void setFlightClass(String flightClass) {
		// TODO Auto-generated method stub
		
	}
}
