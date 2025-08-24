package com.authservice.service;

import com.authservice.entities.UserInfo;
import com.authservice.entities.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/*
* customer user detail wo class hai jo database sa user ki aik row la kar ati hai jiss ma username, password, user ki authorities hoti hai, or innn sab ko save kar leti
* hai. or spring security issi sa authenticated user ki authorities ko check karta hai.
*/
public class CustomeUserDetails extends UserInfo
    implements UserDetails
{
    private String username;

    private String password;

    Collection<? extends GrantedAuthority> authorities;

    public CustomeUserDetails(UserInfo byUsername){
        this.username = byUsername.getUserName();
        this.password = byUsername.getPassword();
        List<GrantedAuthority> auths = new ArrayList<>();

        for(UserRole role : byUsername.getRoles()){
            auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        }
        this.authorities = auths;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return this.authorities;
    }

    @Override
    public String getUsername(){
        return this.username;
    }

    @Override
    public String getPassword(){
        return this.password;
    }


}
