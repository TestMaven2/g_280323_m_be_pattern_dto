package com.example.pattern_dto.controller;

import com.example.pattern_dto.domain.dto.UserDTO;
import com.example.pattern_dto.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public UserDTO save(@RequestBody UserDTO user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}