package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static String[] returnNextMonth() {
        //Create date object
        Date dNow = new Date();
        //Create calender object for Gregorian Calender
        Calendar calendar =  new GregorianCalendar();
        // Set calendar object to current date
        calendar.setTime(dNow);
        //Create object for SimpleDateFormat
        // Defining Date Format to - example:(Jan-2022)
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");
        // Increment the current month
        calendar.add(Calendar.MONTH,1);
        // Generate the base on the specified object
        String date = sdf.format(calendar.getTime());
        //Returning the value of the month and year in an array
       return date.split("-");
    }


}

