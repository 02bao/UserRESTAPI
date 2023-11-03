package com.UserRestAPI.UserRestAPI.model.mapper;

import com.UserRestAPI.UserRestAPI.entity.User;
import com.UserRestAPI.UserRestAPI.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user) {
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        tmp.setAvatar(user.getAvatar());

        return  tmp;

    }
}
