package tripsearchengine;

public class MockHotelQuery implements HotelQueryI {

	public HotelStayI[] executeQuery() {
		HotelStayI[] result = new MockHotelStay[3];
		HotelStayI a = new MockHotelStay();
		result[0] = a;
		result[1] = a;
		result[2] = a;
		return result;
	}
	
}
