import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d", Locale.ENGLISH);
        String dayOfMonth = dayOfMonthFormat.format(currentDate);

        SimpleDateFormat monthOfYearFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        String monthOfYear = monthOfYearFormat.format(currentDate);

        SimpleDateFormat timeOfCurrentDayFormat = new SimpleDateFormat("HH:mm");
        String timeOfCurrentDay = timeOfCurrentDayFormat.format(currentDate);


        SimpleDateFormat timeOfCurrentDayFormatAMPM = new SimpleDateFormat("hh:mm a");
        String timeOfCurrentDayAMPM = timeOfCurrentDayFormatAMPM.format(currentDate);


        System.out.println("Current Day of the Week: " + dayOfWeek);
        System.out.println("Current Day of the Month: " + dayOfMonth);
        System.out.println("Current Month of the Year: " + monthOfYear);
        System.out.println("Current Time of the Day: " + timeOfCurrentDay);
        System.out.println("Current Time of the Day: " + timeOfCurrentDayAMPM);

        System.out.println
                ("\nCurrent Date: " + dayOfMonth + " " + monthOfYear + " " + dayOfWeek +
                        " " + timeOfCurrentDay + " / " + timeOfCurrentDayAMPM);

        SimpleDateFormat fullFormat = new SimpleDateFormat("d MMMM EEEE HH:mm");
        SimpleDateFormat fullFormatEnglish = new SimpleDateFormat("d MMMM EEEE HH:mm", Locale.ENGLISH);
        System.out.println("\nCurrent Date and Time: " + fullFormat.format(currentDate));
        System.out.println("Current Date and Time: " + fullFormatEnglish.format(currentDate));
    }
}
