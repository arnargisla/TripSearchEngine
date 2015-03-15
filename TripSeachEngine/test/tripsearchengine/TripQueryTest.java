package tripsearchengine;

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
	public void testNotNull(){
		assertNotNull(tripQuery);
	}
	
	@Test
	public void thisShouldFail(){
		tripQuery = null;
		assertNotNull(tripQuery);
	}
}
