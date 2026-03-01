package com.example.demo.controller;


import com.example.demo.entities.EntityUsers;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<EntityUsers> findAll() {
        return userService.findByAll();
    }

    @GetMapping("/{id}")
    public EntityUsers findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public EntityUsers uptate(@PathVariable Long id, @RequestBody EntityUsers obj) {
        return userService.update(id, obj);
    }

    @PostMapping
    public ResponseEntity<EntityUsers> insert(@RequestBody EntityUsers obj) {
        obj = userService.insert(obj); // Chama o service para salvar
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.Delete(id);
        return ResponseEntity.noContent().build();
    }


}
