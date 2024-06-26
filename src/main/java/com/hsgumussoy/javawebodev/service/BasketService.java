package com.hsgumussoy.javawebodev.service;

import com.hsgumussoy.javawebodev.entity.Basket;
import com.hsgumussoy.javawebodev.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BasketService {

    @Autowired
    public BasketRepository repository;

    public Basket create(Basket basket) {
        return repository.save(basket);
    }

    public Basket get(String id) {
        return repository.findBasketsByUser_UserId(Integer.parseInt(id));
    }

    public Basket update(String id, Basket basket) {
        Basket existingBasket = repository.findBasketsByUser_UserId(Integer.parseInt(id));
        if (existingBasket != null) {
            existingBasket.setBasketName(basket.getBasketName());
            existingBasket.setUser(basket.getUser());
            return repository.save(existingBasket);
        } else {
            return null; // veya uygun bir hata durumu
        }
    }

    public void delete(String id) {
        repository.deleteBasketByUser_UserId(Integer.parseInt(id));
    }

    public List<Basket> getAll() {
        return repository.findAll();
    }

}
