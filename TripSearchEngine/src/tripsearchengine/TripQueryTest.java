package tripsearchengine;

import java.util.ArrayList;
import java.util.Date;

import org.junit.*;

import static org.junit.Assert.*;

public class TripQueryTest {
	private TripQuery tripQuery;
	private ArrayList<Trip> tripList;
	private FlightQueryI flightQuery;
	private HotelQueryI hotelQuery;
	
	@Before
	public void setUp(){
		flightQuery = new MockFlightQuery();
		hotelQuery = new MockHotelQuery();
		tripQuery = new TripQuery(flightQuery, hotelQuery);
	}
	
	@After
	public void tearDown(){
		tripList = null;
		flightQuery = null;
		hotelQuery = null;
		tripQuery = null;
	}
	
	@Test
	public void testNotNull(){
		tripList = new ArrayList<Trip>();
		assertNotNull(tripList);
	}
	
	@Test
	public void checkIfHotelIsHotel(){
		boolean result;
		tripList = tripQuery.executeQuery();
		result = tripList.get(0).getHotelStay().getHotelName().equals("Hotel Holt");
		assertTrue(result);
	}
	
	@Test
	public void TestHotelBudgetConstraint(){
		int hotelBudget = 15000;
		tripQuery.setMaxPrice(hotelBudget);
		tripList = tripQuery.executeQuery();
		for(int i=0; i<tripList.size(); i++){
			Trip t = tripList.get(i);
			int hotelPrice = t.getHotelStay().getHotelPrice();
			assertTrue(hotelPrice <= hotelBudget);
		}
	}
	
	@Test
	public void TestFlightClassCorrect(){
		String flightClass = "firstClass";
		tripQuery.setFlightClass(flightClass);
		tripList = tripQuery.executeQuery();
		for(int i=0; i<tripList.size(); i++){
			Trip t = tripList.get(i);
			assertEquals(flightClass, t.getFlightTrip().getClass());
		}
	}
	
	@Test
	public void TestHotelDateRange(){
		Date departureDate = new Date(2015,6,6);
		Date returnDate = new Date(2015,6,12);
		tripQuery.setDepartureDate(departureDate);
		tripQuery.setReturnDate(returnDate);
		tripList = tripQuery.executeQuery();
		for(int i=0; i<tripList.size(); i++){
			Trip t = tripList.get(i);
			assertTrue(departureDate.before(t.getHotelStay().getCheckInTime()));
		}
	}
}

