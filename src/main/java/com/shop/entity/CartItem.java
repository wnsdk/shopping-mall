package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "cart_item")
public class CartItem {

    @Id
    @GeneratedValue
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;

    @ManyToOne // 다대일 매핑
    @JoinColumn(name = "item_id") // 상품엔티티와 연결 - 어떤 상품이 담기는가?
    private Item item;

    private int count;
}
