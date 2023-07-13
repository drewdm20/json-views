package com.example.json_views.service;

import com.example.json_views.dto.AdminDto;
import com.example.json_views.dto.FarmerDto;
import com.example.json_views.models.Farmer;
import com.example.json_views.models.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    List<Farmer> findAll();

    Farmer findById(Long id);

    void saveUser(User user);

    void saveFarmer(Farmer farmer);

    void updateFarmer(Long id, Farmer farmer);

    void deleteById(Long id);
}
