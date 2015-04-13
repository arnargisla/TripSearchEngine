package tripsearchengine;

import java.util.Date;

//This mock object simulates a HotelStayI that has the following features:
// hotelName = "Hotel Holt";
// checkInTime = new Date(2015, 10, 5);
// checkOutTime = new Date(2015, 10, 15);

public class MockHotelStay implements HotelStayI {
	private String hotelName;
	private Date checkInTime;
	private Date checkOutTime;
	
	public MockHotelStay() {
		this.hotelName = "Hotel Holt";
		this.checkInTime = new Date(2015, 10, 5);
		this.checkOutTime = new Date(2015, 10, 15);
	}

	@Override
	public String getHotelName() {
		return this.hotelName;
	}

	@Override
	public int getHotelPrice() {
		return 15509;
	}

	@Override
	public Date getCheckInTime() {
		return this.checkInTime;
	}

	@Override
	public Date getCheckOutTime() {
		return this.checkOutTime;
	}
}
