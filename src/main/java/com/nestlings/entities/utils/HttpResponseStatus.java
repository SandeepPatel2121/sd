/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nestlings.entities.utils;

/**
 *
 * @author ú
 */
public class HttpResponseStatus {
    

    /*
    * REGISTRATION
     */
    public final static String USER_REGISTERED_SUCCESS = "success ! user registered successfully !";
    public final static String USER_ALREADY_EXIST = "failed ! user already exist with given email address !";
    public final static String USER_FOUND_UNIQUE = "success ! user found unique !";
    
     public final static String FACEBOOK_ID_MISSING = "failed ! user facebook id missing!";
     
     public final static String EMAIL_MISSING = "failed ! user email id missing!";
     
     public final static String GOOGLE_ID_MISSING = "failed ! user fackbook id missing!";
    
    /**
     * Parameter Not Supplied
     */

    public static final String USER_UPDTE = "success ! user update successfully.!!";
            
    public final static String USER_INFO = "success ! user info registered successfully !";

    public static final String USER_NOT_FOUND = "User not found.";
    
    public static final String FACEBOOK_USER_NOT_FOUND = "Unique User data not found for member with facebookId";
    
    public static final String GOOGLE_USER_NOT_FOUND = "Unique User data not found for member with googleId";
    
    public static final String SELECT_USER_TYPE = "User not selected";
    
    public static final String SUCCESSFUL = "success";
    
    public static final String RESET_PASSWORD = "Password reset successfully.!!";


    
}
