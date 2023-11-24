package com.example.pattern_dto.service;

import com.example.pattern_dto.domain.dto.UserDTO;
import com.example.pattern_dto.domain.entity.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserMappingService {

    private DogMappingService dogMappingService;

    public UserMappingService(DogMappingService dogMappingService) {
        this.dogMappingService = dogMappingService;
    }

    public UserDTO mapToDto(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPassword("password is hidden");
        dto.setMoney(new BigDecimal(0));
        dto.setDog(dogMappingService.mapToDto(entity.getDog()));
        return dto;
    }

    public User mapToEntity(UserDTO dto) {
        User entity = new User();
        entity.setId(0);
        entity.setName(dto.getName());
        entity.setPassword(String.valueOf(dto.getPassword().hashCode()));
        entity.setMoney(dto.getMoney());
        entity.setDog(dogMappingService.mapToEntity(dto.getDog()));
        return entity;
    }
}