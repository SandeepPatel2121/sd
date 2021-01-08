package com.nestlings.entities.utils;

/**
 *
 * @author ú
 */
public class EntityConstants {

    public static final String USER_CODE_PREFIX = "U";
    public static final String LOGGED_IN_USER = "loggedInUser";
    
    /*
     * FCM_PUSH_NOTIFICATION
     */
    public static final String NOTIFICATION_DATA_URL = "http://localhost:8084/notification/data";
    public static final String ERRORMESSAGE_TO_SEND_NOTIFICATION = "Error to send notification";
    public static final String SUCCESSMESSAGE_TO_SEND_NOTIFICATION = "Successfully to send notification";
    
    /*
     * EXCHANGE
     */
    public static final String MESSAGING_EXCHANGE = "nestlings_webapp";
    
    /*
     * QUEUE
     */
    public static final String MESSAGING_MESSAGING_QUEUE = "messaging_queue";
    public static final String MESSAGING_COMMON_QUEUE = "common_queue";
    
    /*
     * ROUTING_KEY
     */
    public static final String MESSAGING_MESSAGING_ROUTING = "messaging";
    public static final String MESSAGING_COMMON_ROUTING = "common";

}
