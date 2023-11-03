package com.UserRestAPI.UserRestAPI.service;

import com.UserRestAPI.UserRestAPI.entity.User;
import com.UserRestAPI.UserRestAPI.exception.NotFoundException;
import com.UserRestAPI.UserRestAPI.model.dto.UserDto;
import com.UserRestAPI.UserRestAPI.model.mapper.UserMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Luong Thai Bao ", "luongthaibao@gmail.com", "0865436287", "avatar.img","123"));
        users.add(new User(2, "Pham Thu Thao" , "phamthuthao@gmail.com", "0123456789", "avatar2.img", "234"));
        users.add(new User(3 , "Luong Trong Bang", "luongtrongbang@gmail.com", "0234567891", "avatar3.img", "345"));
        users.add(new User(4 , "Nguyen Thai Bao" , "nguyenthaibao@gmail.com" , "03024343234", "avatar5.img" , "456"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for(User user : users) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return UserMapper.toUserDto(user);
            }
        }
            throw new NotFoundException("User không tồn tại trong hệ thống ");

    }

    @Override
    public List<UserDto> searchUser(String Keyword) {
        List<UserDto> result = new ArrayList<>();
        for( User user : users) {
            if(user.getName().contains(Keyword)) {
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
