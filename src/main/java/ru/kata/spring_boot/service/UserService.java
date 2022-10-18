package ru.kata.spring_boot.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getUsers();

    User findById(Long id);

    void update(Long id, User userToUpdate);

    void deleteById(Long id);

}
