package com.projecthr.hrnew.Service;

import com.projecthr.hrnew.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    void deleteUser(Long userId);

}
