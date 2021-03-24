package com.nestlings.entities.utils;


import com.nestlings.entities.response.member.Notification;
import com.nestlings.user.device.UserDeviceModel;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class NestlingUtils {

    private NestlingUtils(){}

    public static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

    public static final DateTimeFormatter YYYY_MM_DD_HHMM_FORAMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static final DateTimeFormatter MONTH_DAY_YEAR_TIME_FORMAT = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

    public static final DateTimeFormatter DAY_FULLMONTH_YEAR_TIME_FORMAT = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm");

    private static final Map<Integer, String> universityApplicationStatuses = new HashMap<>();
    
    public static final List<NotificationType> emailSenderExcludeUserActions = new ArrayList();

    public static final List<String> defaultUsernames = new ArrayList();
    
    public static final String UNIVERSITY_APPLICATION_APPLICATION_SENT = "APPLICATION_SENT";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_ACCEPTED = "APPLICATION_ACCEPTED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_DENIED = "APPLICATION_DENIED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_SAVED = "APPLICATION_SAVED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_IN_CONSIDERATION = "APPLICATION_IN_CONSIDERATION";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_NEEDS_MORE_INFO = "APPLICATION_NEEDS_MORE_INFO";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_WAITLISTED = "APPLICATION_WAITLISTED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_OFFER_ACCEPTED = "OFFER_ACCEPTED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_OFFER_REJECTED = "OFFER_REJECTED";

    static {
        loadUniversityApplicationStatuses();
        loadEmailExcludeUserActions();
        loadDefaultUserids();
    }

    public static void loadUniversityApplicationStatuses() {
        universityApplicationStatuses.put(14, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_SENT);
        universityApplicationStatuses.put(15, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_ACCEPTED);
        universityApplicationStatuses.put(16, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_DENIED);
        universityApplicationStatuses.put(17, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_SAVED);
        universityApplicationStatuses.put(18, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_IN_CONSIDERATION);
        universityApplicationStatuses.put(19, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_NEEDS_MORE_INFO);
        universityApplicationStatuses.put(20, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_WAITLISTED);
        universityApplicationStatuses.put(21, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_OFFER_ACCEPTED);
        universityApplicationStatuses.put(22, NestlingUtils.UNIVERSITY_APPLICATION_APPLICATION_OFFER_REJECTED);
    }

    public static void loadEmailExcludeUserActions() {
        emailSenderExcludeUserActions.add(NotificationType.PROFILE_VIEW);
        emailSenderExcludeUserActions.add(NotificationType.MESSAGE_FROM_USER);
        emailSenderExcludeUserActions.add(NotificationType.MESSAGE_REPLY_FROM_USER);
        emailSenderExcludeUserActions.add(NotificationType.POST_REPLY_FROM_USER);
        emailSenderExcludeUserActions.add(NotificationType.FRIEND_REQUEST_RECEIVED);
        emailSenderExcludeUserActions.add(NotificationType.COLLEGE_APPLICATION_SUBMIT);
        emailSenderExcludeUserActions.add(NotificationType.COLLEGE_APPLICATION_STATUS_CHANGE);
        emailSenderExcludeUserActions.add(NotificationType.COLLEGE_APPLICATION_OFFER_ACCEPT);
        emailSenderExcludeUserActions.add(NotificationType.COLLEGE_APPLICATION_OFFER_REJECT);
        emailSenderExcludeUserActions.add(NotificationType.COLLEGE_APPLICATION_REPLY);
    }

    public static String getUniversityApplicationStatusByStatusId(Integer statusId) {
        return universityApplicationStatuses.get(statusId);
    }

    public static void loadDefaultUserids() {
        defaultUsernames.add("support@nestlings.com");
    }


    public static String convertDateStringFormat(String inputDateString, DateTimeFormatter inputDateTimeFormatter, DateTimeFormatter outputDateTimeFormatter) {
        try {
            return LocalDateTime.parse(inputDateString,inputDateTimeFormatter).format(outputDateTimeFormatter);
        } catch(DateTimeException e) {
            return inputDateString;
        }
    }

    public static String getMemberFullName(String firstName, String lastName) {
        String fullName = "";
        boolean hasFirstName = !Objects.isNull(firstName) && !firstName.isEmpty();
        boolean hasLastName = !Objects.isNull(lastName) && !lastName.isEmpty();
        if (hasFirstName) {
            fullName = firstName;
        }
        if (hasFirstName && hasLastName) {
            fullName = fullName + " ";
        }

        if (hasLastName) {
            fullName = fullName + lastName;
        }
        return fullName;
    }

    public static Integer getUniversityApplicationStatusIdByStatus(String status) {
        Integer statusId = null;
        for(Map.Entry<Integer, String> applicationStatus : universityApplicationStatuses.entrySet()) {
            if(applicationStatus.getValue().equalsIgnoreCase(status)) {
                statusId = applicationStatus.getKey();
            }
        }
        return statusId;
    }

    public static boolean hasDeviceModels(List<UserDeviceModel> deviceModels) {
        return (deviceModels != null && !deviceModels.isEmpty());
    }

    public static boolean hasNotification(Notification notification) {
        return !Objects.isNull(notification);
    }

    public static boolean hasUniversityName(String universityName){
        return (!universityName.isEmpty()) && StringUtils.hasText(universityName);
    }

    public static boolean hasField(String field){
        return field!=null && !field.isEmpty();
    }

    public static boolean hasRequestPrograms(String requestPrograms){
        return (!requestPrograms.isEmpty()) && StringUtils.hasText(requestPrograms);
    }

    public static boolean hasCountryName(String countryName){
        return (!countryName.isEmpty()) && StringUtils.hasText(countryName);
    }

    public static double round(double value,int places){
        if(places<0) throw  new IllegalArgumentException();

        BigDecimal decimal = new BigDecimal(Double.toString(value));
        decimal = decimal.setScale(places, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
}
