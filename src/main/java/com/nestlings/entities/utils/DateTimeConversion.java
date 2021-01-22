package com.nestlings.entities.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
public class DateTimeConversion {

    private static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
    public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private DateTimeConversion(){}

    public static String calendarToddMMYYHHMMSS(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_FORMAT);
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
        Calendar calendar = stringToCalendar(date);
        if(calendar!=null){
            return calendarToddMMYYHHMMSS(calendar);
        }
        return null;
    }

    public static String convetStringDateTimetoDateTimeStringFormat(String date){
        Calendar calendar = stringToCalendar(date);
        if(calendar!=null){
            return calendarToddMMYYYYHHMM(calendar);
        }
        return null;
    }


    public static String convetStringDateTimetoDateStringFormat(String date){
        Calendar calendar = stringToCalendar(date);
        if(calendar!=null){
            return calendarToddMMYYYY(calendar);
        }
        return null;
    }

    public static Calendar stringToCalendar(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS);
        Calendar cal = null;
        if (strDate!=null && (!strDate.isEmpty())){
            try {
                Date date1 = formatter.parse(strDate);
                cal = Calendar.getInstance();
                cal.setTime(date1);
                return cal;
            } catch (ParseException ex) {
                log.error("Error in stringToCalendar...");
            }
        }
        return null;
    }
    
     public static String calendarToYYMMDDHHMMSS(Calendar calender) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS);
        return String.valueOf(formatter.format(calender.getTime()));
    }
    
    public static String convetStringDateTimetoDateStringFormat1(String date){
        Calendar calendar = stringToCalendar1(date);
        if(calendar!=null){
            return calendarToYYMMDDHHMMSS(calendar);
        }
        return null;
    }

    
     public static Calendar stringToCalendar1(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS);
        try {
            Date date1 = formatter.parse(strDate);
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
            log.error("Error in stringToCalendar1...");
        }
        return null;
    }
     
}
