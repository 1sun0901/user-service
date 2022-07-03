package com.example.userservice.vo;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull
    @Size(min = 2)
    @Email
    private String email;

    @NotNull
    @Size(min = 2)
    private String name;

    @NotNull
    @Size(min = 6)
    private String pwd;
    

}
