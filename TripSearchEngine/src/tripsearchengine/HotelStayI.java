package tripsearchengine;

import java.util.Date;

public interface HotelStayI {
	public abstract String getHotelName();
	
	public abstract int getHotelPrice();
	
	public abstract Date getCheckInTime();

	public abstract Date getCheckOutTime();
}
