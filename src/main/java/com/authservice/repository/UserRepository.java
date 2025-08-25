package com.authservice.repository;

import com.authservice.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Integer>
{
    public UserInfo findByUserName(String userName);
}
