package com.example.pattern_dto.service;

import com.example.pattern_dto.domain.dto.UserDTO;
import com.example.pattern_dto.domain.entity.User;
import com.example.pattern_dto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;
    private UserMappingService mappingService;

    public UserService(UserRepository repository, UserMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    public List<UserDTO> getAll() {
        return repository.findAll().stream().map(mappingService::mapToDto).toList();
    }

    public UserDTO getById(int id) {
        User user = repository.findById(id).orElse(null);
        return user == null ? null : mappingService.mapToDto(user);
    }

    public UserDTO save(UserDTO user) {
        return mappingService.mapToDto(repository.save(mappingService.mapToEntity(user)));
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}