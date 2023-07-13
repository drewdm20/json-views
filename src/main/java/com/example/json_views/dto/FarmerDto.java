package com.example.json_views.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FarmerDto {

    private String firstName;

    private String lastName;

    private String cellPhone;

    private String email;

    private String password;

    private String idNumber;

    private String address;

    private String role;
}
