package com.example.pattern_dto.domain.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class UserDTO {

    private int id;
    private String name;
    private String password;
    private BigDecimal money;
    private DogDTO dog;

    public UserDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public DogDTO getDog() {
        return dog;
    }

    public void setDog(DogDTO dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return id == userDTO.id && Objects.equals(name, userDTO.name) && Objects.equals(password, userDTO.password) && Objects.equals(money, userDTO.money) && Objects.equals(dog, userDTO.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, money, dog);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", dog=" + dog +
                '}';
    }
}