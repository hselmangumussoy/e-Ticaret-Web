package com.hsgumussoy.javawebodev.Dto;

public class BasketDto {
    private Long basketId;
    private UserDto user;

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
