package com.hsgumussoy.javawebodev.controller;

import com.hsgumussoy.javawebodev.entity.User;
import com.hsgumussoy.javawebodev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    //CRUD

    //Create - yarat
    //Read - oku
    //Update - güncelle
    //Delete - sil

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable (name = "id") String id){
        return userService.get(id);
    }


    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PutMapping
    public User update(@PathVariable(name = "id") String id,@RequestBody User user){
        return userService.update(id, user);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable (name = "id") String id){
          userService.delete(id);
    }




}/*"birthDay": 1990,
    "password": "password",
    "userName": "John",
    "userSurname": "Doe",
    "tckn": 123456789,
    "userCity": "Istanbul",
    "userTelno": "1234567890"*/
