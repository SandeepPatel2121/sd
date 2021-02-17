
package com.nestlings.entities.utils;

/**
 *
 * @author ú
 */
public class HttpResponseStatus {
    
    private HttpResponseStatus(){}
    /*
    * REGISTRATION
     */
    public static final String USER_REGISTERED_SUCCESS = "success ! user registered successfully !";
    public static final String USER_ALREADY_EXIST = "failed ! user already exist with given email address !";
    public static final String USER_FOUND_UNIQUE = "success ! user found unique !";

    public static final String FACEBOOK_ID_MISSING = "failed ! user facebook id missing!";

    public static final String EMAIL_MISSING = "failed ! user email id missing!";

    public static final String GOOGLE_ID_MISSING = "failed ! user google id missing!";

    public static final String APPLE_ID_MISSING = "failed ! user apple id missing!";
    
    /**
     * Parameter Not Supplied
     */

    public static final String USER_UPDTE = "success ! user update successfully.!!";

    public static final String USER_INFO = "success ! user info registered successfully !";

    public static final String USER_NOT_FOUND = "User not found.";
    
    public static final String FACEBOOK_USER_NOT_FOUND = "Unique User data not found for member with facebookId";
    
    public static final String GOOGLE_USER_NOT_FOUND = "Unique User data not found for member with googleId";

    public static final String APPLE_USER_NOT_FOUND = "Unique User data not found for member with appleId";
    
    public static final String SELECT_USER_TYPE = "User not selected";
    
    public static final String SUCCESSFUL = "success";
    
    public static final String RESET_PASSWORD = "Password reset successfully.!!";

    public static final String NOTIFICTION_LIST = "success ! notification listed successfully.";

    public static final String UNIVERSITY_SAVE = "success ! university save successfully.";

    public static final String UNIVERSITY_REMOVE = "success ! university remove successfully.";

    public static final String APPLICATION_LIST = "success ! application listed successfully.";

    public static final String NOTIFICATION_SENT = "Notification has been sent.";



    
}
