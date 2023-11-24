package com.example.pattern_dto.service;

import com.example.pattern_dto.domain.dto.DogDTO;
import com.example.pattern_dto.domain.entity.Dog;
import org.springframework.stereotype.Service;

@Service
public class DogMappingService {

    public DogDTO mapToDto(Dog entity) {
        DogDTO dto = new DogDTO();
        dto.setId(entity.getId());
        dto.setAge(entity.getAge());
        dto.setName(entity.getName());
        return dto;
    }

    public Dog mapToEntity(DogDTO dto) {
        Dog entity = new Dog();
        entity.setAge(dto.getAge());
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}