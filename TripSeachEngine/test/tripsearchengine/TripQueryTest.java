package tripsearchengine;

import java.util.Date;

import org.junit.*;

import static org.junit.Assert.*;

public class TripQueryTest {
	private TripQuery tripQuery;
	
	@Before
	public void setUp(){
		tripQuery = new TripQuery();
	}
	
	@After
	public void tearDown(){
		tripQuery = null;
	}
	
	@Test
	public void testNoNullTrips(){
		Date departureDate = new Date(2015, 2, 3);	
		tripQuery.setDepartureDate(departureDate);
		Trip[] trips = tripQuery.executeQuery();
		for(int i=0; i<trips.length; i++){
			assertNotNull(trips[i]);
		}
	}
}
