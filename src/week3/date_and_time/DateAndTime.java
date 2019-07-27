package week3.date_and_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));

        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM");
        System.out.println("Month in letter : " + sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        System.out.println("Month in number : " + sdf2.format(date));

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd MM YYYY");
        System.out.println("day, month, year : " + sdf3.format(date));
    }
}
