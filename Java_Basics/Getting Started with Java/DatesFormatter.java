import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String dayOfWeek = dayOfWeekFormat.format(currentDate);
        System.out.println("Current Day of the Week: " + dayOfWeek);
    }
}
