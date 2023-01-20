package com.example.foodmartapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Favourites")
public class Favourites {
    @Id
    private Long id;
    private Long usersId;
    private Long productId;
}
