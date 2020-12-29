package com.nestlings.entities.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

    private ObjectMapperUtil(){}

    public static ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        return objectMapper;
    }
}
