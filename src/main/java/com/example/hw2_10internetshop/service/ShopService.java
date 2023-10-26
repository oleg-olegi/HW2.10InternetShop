package com.example.hw2_10internetshop.service;

import com.example.hw2_10internetshop.cart.ShoppingCart;

import java.util.List;

public interface ShopService {
    public void addItemToCart(List<Integer> itemID);

    public List<Integer> getCart();
}
