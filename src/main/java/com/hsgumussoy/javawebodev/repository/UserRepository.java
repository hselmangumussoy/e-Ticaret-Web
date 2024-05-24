package com.hsgumussoy.javawebodev.repository;

import com.hsgumussoy.javawebodev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByUserId(int id);

    int deleteUserByUserId(int id);//silme işleminden sonra işlem başarılı mı değil mi söylüyor
}
