package com.dshishkin.rostelecomtesttask.dto;

import com.dshishkin.rostelecomtesttask.model.User;
import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String surname;
    private Integer age;
    private String sex;

    public User toUser() {
        return User.builder()
                .name(this.name)
                .surname(this.getSurname())
                .age(this.getAge())
                .sex(User.Sex.valueOf(this.getSex().toUpperCase()))
                .build();
    }
}
