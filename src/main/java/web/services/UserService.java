package web.services;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void deleteUser(Long id);
    void saveUser(User user);
    void  updateUser(User user, Long id);
    User findUserByName(String name);
}
