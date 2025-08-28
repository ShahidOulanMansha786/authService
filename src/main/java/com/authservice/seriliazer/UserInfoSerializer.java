package com.authservice.seriliazer;


import com.authservice.model.UserInfoDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class UserInfoSerializer implements Serializer<UserInfoDto> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String s, UserInfoDto userInfoDto) {
        byte[] retVal = null;
        ObjectMapper mapper = new ObjectMapper();
        try{
            retVal = mapper.writeValueAsString(userInfoDto).getBytes();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return retVal;
    }

    @Override
    public void close() {
    }
}
