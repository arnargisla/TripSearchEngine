package tripsearchengine;

public interface FlightQueryI {
	public abstract FlightTripI[] executeQuery();

	public abstract void setDepartureLocation(String departureLocation);

	public abstract void setReturnLocation(String returnLocation);

	public abstract void setDestinationLocation(String destinationLocation);
}
