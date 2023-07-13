package com.example.json_views.controller;

import com.example.json_views.models.Farmer;
import com.example.json_views.models.User;
import com.example.json_views.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/farmers")
    public List<Farmer> getFarmers() {
        return userService.findAll();
    }

    @GetMapping(value = "/farmers/{id}")
    public Farmer getFarmerById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping(value = "/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PostMapping(value = "/farmer")
    public void saveFarmer(@RequestBody Farmer farmer) {
        userService.saveFarmer(farmer);
    }

    @PutMapping(value = "/farmer/{id}")
    public void updateFarmer(@PathVariable Long id, @RequestBody Farmer farmer) {
        userService.updateFarmer(id, farmer);
    }

    @DeleteMapping(value = "/farmer/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
