package com.nestlings.entities.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeConversion {

    private static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    public static String calendarToddMMYYHHMMSS(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return String.valueOf(formatter.format(calender.getTime()));
    }

    public static String calendarToddMMYYYYHHMM(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return String.valueOf(formatter.format(calender.getTime()));
    }

    public static String calendarToddMMYYYY(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.valueOf(formatter.format(calender.getTime()));
    }

    public static String convetStringDateDemotoDateTimeStringFormat(String date){
        return calendarToddMMYYHHMMSS(stringToCalendar(date));
    }

    public static String convetStringDateTimetoDateTimeStringFormat(String date){
        return calendarToddMMYYYYHHMM(stringToCalendar(date));
    }


    public static String convetStringDateTimetoDateStringFormat(String date){
        return calendarToddMMYYYY(stringToCalendar(date));
    }

    public static Calendar stringToCalendar(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = null;
        if (strDate!=null && (!strDate.isEmpty())){
            try {
                Date date1 = formatter.parse(strDate);
                cal = Calendar.getInstance();
                cal.setTime(date1);
                return cal;
            } catch (ParseException ex) {
            }
        }
        return null;
    }

}
