import org.joda.time.DateTime;

public class WorldTime {

    public String getTimeByCountry(){

        DateTime dt = new DateTime();

        return dt.getHourOfDay() + ":" + dt.getMinuteOfHour();
    }

}
