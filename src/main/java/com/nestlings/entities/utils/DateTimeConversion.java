package com.nestlings.entities.utils;

import java.text.DateFormat;
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
    
     public static String calendarToddMMYYHHMMSS1(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.valueOf(formatter.format(calender.getTime()));
    }
    
    public static String convetStringDateTimetoDateStringFormat1(String date){
        return calendarToddMMYYHHMMSS1(stringToCalendar1(date));
    }

    
     public static Calendar stringToCalendar1(String str_date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = (Date) formatter.parse(str_date);
            Calendar cal = Calendar.getInstance();
            Calendar ca2 = Calendar.getInstance();
            cal.setTime(date1);
             ca2.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 7);
            ca2.set(Calendar.MONTH, cal.get(Calendar.MONTH));
            ca2.set(Calendar.YEAR, cal.get(Calendar.YEAR));
            ca2.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY));
            ca2.set(Calendar.MINUTE, cal.get(Calendar.MINUTE));
            ca2.set(Calendar.SECOND, cal.get(Calendar.SECOND));
            return ca2;
        } catch (ParseException ex) {
        }
        return null;
    }
     
}
