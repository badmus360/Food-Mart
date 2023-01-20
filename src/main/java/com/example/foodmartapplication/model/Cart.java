package com.example.foodmartapplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private int quantity;

    private double cartTotal;

    @OneToMany(mappedBy = "cart", orphanRemoval = true, cascade = CascadeType.REMOVE)
    private List<CartItem> cartItemList;
    @JsonIgnore
    @OneToOne(targetEntity = Users.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Users users;
    public Cart(Users users) {
        this.users = users;
    }


}
