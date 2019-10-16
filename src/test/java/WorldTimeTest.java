import org.junit.jupiter.api.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class WorldTimeTest {
	private WorldTime wt;

	@BeforeEach
    public void setUp() {
	    //Arrange
         wt = new WorldTime();
        //Overriding System Time for Testing in Java
        DateTime date = new DateTime(2019, 10, 22, 10, 5, 0, 0);
        DateTimeUtils.setCurrentMillisFixed(date.getMillis());
    }

    @Test 
    public void testGetTimeByCountryFormat() {
	    //Arrange
    	String validationPattern="[0-9]?[0-9]:[0-9]?[0-9]";
    	//Act
        boolean expected = wt.getTimeByCountry().matches(validationPattern);
        //Assert
        Assertions.assertTrue(expected, "Wrong format");
    }
}
