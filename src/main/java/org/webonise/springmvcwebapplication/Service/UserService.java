package org.webonise.springmvcwebapplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webonise.springmvcwebapplication.Model.Users;
import org.webonise.springmvcwebapplication.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Object findAll() {
        return userRepository.findAll();
    }

    public Users findById(Integer id) {
        return userRepository.findOne(id);
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }
}
