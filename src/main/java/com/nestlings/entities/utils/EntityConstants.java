package com.nestlings.entities.utils;

/**
 *
 * @author ú
 */
public class EntityConstants {

    public static final String USER_CODE_PREFIX = "U";
    public static final String LOGGED_IN_USER = "loggedInUser";


    public static final String UNIVERSITY_SERVICE_URL = "http://localhost:8082/";
        
    /*
     * EXCHANGE
     */
    public static final String MESSAGING_EXCHANGE = "nestlings_webapp";
    
    /*
     * QUEUE
     */
    public static final String MESSAGING_MESSAGING_QUEUE = "messaging_queue";
    public static final String MESSAGING_COMMON_QUEUE = "common_queue";
    public static final String MESSAGING_NOTIFICATION_QUEUE = "notification_queue";
    
    /*
     * ROUTING_KEY
     */
    public static final String MESSAGING_MESSAGING_ROUTING = "messaging";
    public static final String MESSAGING_COMMON_ROUTING = "common";
    public static final String MESSAGING_NOTIFICATION_ROUTING = "notification";

}
