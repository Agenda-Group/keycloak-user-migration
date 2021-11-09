package com.danielfrak.code.keycloak.providers.rest.rest;

import java.util.Objects;

public class UserDto {
    private String id;
    private String username;
    private String fullName;

    public UserDto() {
    }

    public UserDto(String id, String username, String fullName) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto that = (UserDto)o;

        return Objects.equals(id, that.id) && Objects.equals(username,  that.username) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, fullName);
    }
}
