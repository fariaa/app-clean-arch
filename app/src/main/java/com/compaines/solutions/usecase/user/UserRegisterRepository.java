package com.compaines.solutions.usecase.user;

public interface UserRegisterRepository {
    public UserCustomImpl register(String name, String email);
}
