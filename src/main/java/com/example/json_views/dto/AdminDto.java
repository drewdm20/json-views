package com.example.json_views.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {

    private String firstName;

    private String lastName;

    private String cellPhone;

    private String email;

    private String password;

    private String role;
}
