package ru.kata.spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring_boot.model.User;
import ru.kata.spring_boot.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void update(Long id, User userToUpdate) {
        userToUpdate.setId(id);
        userRepository.save(userToUpdate);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
