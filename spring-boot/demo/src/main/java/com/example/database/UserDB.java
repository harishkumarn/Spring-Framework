package com.example.database;

import com.pojo.User;

public interface UserDB {
    public User getUserById(Integer id) throws UserException;

    public void createUser(User user) throws UserException;
}
