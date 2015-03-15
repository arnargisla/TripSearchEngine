package tripsearchengine;

import org.junit.*;
import static org.junit.Assert.*;

public class TripQueryTest {
	private TripQuery tripQuery;
	private Trip[] tripTest = new Trip[15]; 
	private FlightQueryI flightQuery;
	private HotelQueryI hotelQuery;
	
	@Before
	public void setUp(){
		flightQuery = new MockFlightQuery();
		hotelQuery = new MockHotelQuery();
		tripQuery = new TripQuery(flightQuery, hotelQuery);
		tripTest = tripQuery.executeQuery();
		
	}
	
	@After
	public void tearDown(){
		tripQuery = null;
	}
	
	@Test
	public void testNotNull(){
		assertNotNull(tripQuery);
	}
	
	@Test
	public void checkifitworks(){
		assertTrue(tripTest.length > 0);
	}
}
