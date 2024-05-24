package com.hsgumussoy.javawebodev.controller;

import com.hsgumussoy.javawebodev.Dto.BasketDto;
import com.hsgumussoy.javawebodev.Dto.BasketRequest;
import com.hsgumussoy.javawebodev.Dto.UserDto;
import com.hsgumussoy.javawebodev.entity.Basket;
import com.hsgumussoy.javawebodev.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("baskets")
public class BasketController {

    //CRUD

    //Create - yarat
    //Read - oku
    //Update - güncelle
    //Delete - sil

    @Autowired
    private BasketService service;

    //POST a RequestPath konmaz. Konursa o PUT olur zaten.
    //RequestPath den veya RequestParam dan bir şey gönderiyorsam o  GET dir.
    // GET metodunun da body si olmaz. *****
    @PostMapping
    public Basket create(@RequestBody Basket basket){
        return service.create(basket);
    }

    @GetMapping("/{id}")
    public Basket get( @RequestParam(value = "userId")  String userId){
        return service.get(userId);
    }
//şlksdfsk
    @GetMapping
    public List<Basket> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Basket update(@PathVariable(name = "id") String id, @RequestBody Basket basket){
        return service.update(id, basket);
    }
//değişiklik

    @DeleteMapping("/{id}")
    public void delete(@PathVariable (name = "id") String id){
        service.delete(id);
    }

    /*public BasketDto toDto(BasketRequest request){
        BasketDto dto = new BasketDto();
        dto.setUser(new UserDto(request.getUserId()));
    }*/


}