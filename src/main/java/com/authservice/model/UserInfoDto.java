package com.authservice.model;


import com.authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {

    public String firstName;

    public String lastName;

    public String email;
    
    public Long phoneNumber;
}
