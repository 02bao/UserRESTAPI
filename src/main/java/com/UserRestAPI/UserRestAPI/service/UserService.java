package com.UserRestAPI.UserRestAPI.service;

import com.UserRestAPI.UserRestAPI.entity.User;
import com.UserRestAPI.UserRestAPI.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();

    public  UserDto getUserById(int id) throws ClassNotFoundException;

    public List<UserDto> searchUser(String Keyword);
}


