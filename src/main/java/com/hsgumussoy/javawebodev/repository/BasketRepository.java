package com.hsgumussoy.javawebodev.repository;

import com.hsgumussoy.javawebodev.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket,Integer> {
    //Basket findBasketByBasketId(int i);
    //int deleteBasketByBasketId(int id);//silme işleminden sonra işlem başarılı mı değil mi söylüyor

    Basket findBasketsByUser_UserId(int userId);
    void deleteBasketByUser_UserId(int userId);

}
