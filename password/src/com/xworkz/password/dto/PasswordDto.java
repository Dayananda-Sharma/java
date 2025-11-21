package com.xworkz.password.dto;

import java.util.Objects;

public class PasswordDto {
    public String password;
    public String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PasswordDto{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasswordDto that)) return false;
        return Objects.equals(password, that.password) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, name);
    }
    public PasswordDto(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
