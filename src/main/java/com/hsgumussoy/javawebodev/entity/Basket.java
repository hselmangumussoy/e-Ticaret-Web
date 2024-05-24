package com.hsgumussoy.javawebodev.entity;

import jakarta.persistence.*;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long basketId;
    private String basketName;

    @OneToOne/*(cascade = CascadeType.ALL)*///cascade: hangi işlemlere yetkilidir.
    @JoinColumn(name = "user_id",referencedColumnName = "userId")//JoinColumn :birleştirici kolon - hangi kolonla ilişki kuracağını yönetir
    private User user;

    public Basket(Long basketId, String basketName,User user) {
        this.basketId = basketId;
        this.basketName = basketName;
        this.user = user;
    }

    public Basket() {
    }

    public String getBasketName() {
        return basketName;
    }

    public void setBasketName(String basketName) {
        this.basketName = basketName;
    }
   public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }

    public Long getBasketId() {
        return basketId;
    }


}
