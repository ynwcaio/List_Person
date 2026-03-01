package com.example.demo.services;


import com.example.demo.entities.EntityUsers;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<EntityUsers> findByAll() {
        return userRepository.findAll();
    }

    public EntityUsers findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));
    }

    public EntityUsers insert(EntityUsers obj) {
        return userRepository.save(obj);
    }

    public EntityUsers update(Long id, EntityUsers entityUsers) {

        EntityUsers data = findById(id);

        data.setName(entityUsers.getName());
        data.setAge(entityUsers.getAge());

        return userRepository.save(data);
    }

    public void Delete(Long id) {

        EntityUsers users = findById(id);

        userRepository.delete(users);
    }

}
