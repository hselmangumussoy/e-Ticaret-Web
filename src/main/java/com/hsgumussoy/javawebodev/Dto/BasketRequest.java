package com.hsgumussoy.javawebodev.Dto;

public class BasketRequest {
    private Long basketId;
    private int userId;

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
