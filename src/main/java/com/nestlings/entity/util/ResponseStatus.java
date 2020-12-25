package com.nestlings.entity.util;

/**
 *
 * @author bypt-dev-laptop-9
 */
public class ResponseStatus {
    
    public static ResponseModel create(String message, Object obj, int httpStatusCode) {
        ResponseModel rs = new ResponseModel();
        rs.setMessage(message);
        rs.setData(obj);
        rs.setStatus(httpStatusCode);
        return rs;
    }
   
    
    
}
