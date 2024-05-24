package com.hsgumussoy.javawebodev.service;

import com.hsgumussoy.javawebodev.entity.User;
import com.hsgumussoy.javawebodev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public User get(String id) {
        return userRepository.findById(Integer.parseInt(id)).orElse(null);
    }

    public void delete(String id) {
        userRepository.deleteById(Integer.parseInt(id));
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User update(String id, User user) {
        User exisUser = userRepository.findById(Integer.parseInt(id)).orElse(null);
        if (exisUser != null) {
            exisUser.setUserName(user.getUserName());
            exisUser.setUserCity(user.getUserCity());
            exisUser.setUserTelno(user.getUserTelno());
            exisUser.setUserSurname(user.getUserSurname());
            exisUser.setPassword(user.getPassword());
            exisUser.setTckn(user.getTckn());
            return userRepository.save(exisUser);
        } else {
            return null; // veya uygun bir hata durumu
        }
    }



}
