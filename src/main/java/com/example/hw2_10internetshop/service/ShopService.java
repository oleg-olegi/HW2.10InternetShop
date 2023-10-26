package com.example.hw2_10internetshop.service;

import com.example.hw2_10internetshop.cart.ShoppingCart;

public interface ShopService {
    public void addItemToCart(Integer itemID);

    public ShoppingCart getCart();
}
