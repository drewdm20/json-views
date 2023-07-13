package com.example.json_views.service;

import com.example.json_views.dto.FarmerDto;
import com.example.json_views.models.Farmer;
import com.example.json_views.models.User;
import com.example.json_views.repo.FarmerRepository;
import com.example.json_views.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final FarmerRepository farmerRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, FarmerRepository farmerRepository) {
        this.userRepository = userRepository;
        this.farmerRepository = farmerRepository;
    }

    public List<Farmer> findAll() {
        return farmerRepository.findAll();
    }

    public Farmer findById(Long id) {
        return farmerRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        User userToSave = new User();
        userToSave.setFirstName(user.getFirstName());
        userToSave.setLastName(user.getLastName());
        userToSave.setEmail(user.getEmail());
        userToSave.setPassword(user.getPassword());
        userToSave.setCellPhone(user.getCellPhone());
        userToSave.setRole("ROLE_ADMIN");
        userRepository.save(userToSave);
    }

    public void saveFarmer(Farmer farmer) {
        Farmer farmerToSave = new Farmer();
        farmerToSave.setFirstName(farmer.getFirstName());
        farmerToSave.setLastName(farmer.getLastName());
        farmerToSave.setCellPhone(farmer.getCellPhone());
        farmerToSave.setEmail(farmer.getEmail());
        farmerToSave.setPassword(farmer.getPassword());
        farmerToSave.setIdNumber(farmer.getIdNumber());
        farmerToSave.setAddress(farmer.getAddress());
        farmerToSave.setRole("ROLE_FARMER");
        farmerRepository.save(farmer);
    }

    public void updateFarmer(Long id, Farmer farmer) {
        Farmer farmerToUpdate = farmerRepository.findById(id).orElse(null);
        assert farmerToUpdate != null;
        farmerToUpdate.setCellPhone(farmer.getCellPhone());
        farmerToUpdate.setEmail(farmer.getEmail());
        farmerToUpdate.setPassword(farmer.getPassword());
        farmerToUpdate.setAddress(farmer.getAddress());
        farmerRepository.save(farmerToUpdate);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
