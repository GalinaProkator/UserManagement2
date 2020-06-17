package com.galina.usermanagement2.api;

import com.galina.usermanagement2.entities.UserEntity;
import com.galina.usermanagement2.logic.UsersController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class UserApi {

    @Autowired
    private UsersController usersController;

    @PostMapping
    public void createUser (@RequestBody UserEntity user){
        usersController.createUser(user);
    }

    @PutMapping
    public void updateUser (@RequestBody UserEntity user) {
    }

    @GetMapping ("/{id}")
    public UserEntity getUser (@PathVariable("id") Long id){
        return usersController.getUser(id);
    }

    @DeleteMapping ("/{id}")
    public void deleteUser (@PathVariable("id") Long id){
        usersController.deleteUser(id);
    }

}
