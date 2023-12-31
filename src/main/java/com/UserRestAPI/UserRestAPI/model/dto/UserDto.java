package com.UserRestAPI.UserRestAPI.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class UserDto {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
}
