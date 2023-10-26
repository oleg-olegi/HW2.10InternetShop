package com.example.hw2_10internetshop.service;

import com.example.hw2_10internetshop.cart.ShoppingCart;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShoppingCart shoppingCart;


    @Override
    public void addItemToCart(Integer itemID) {

        shoppingCart.addItemToCart(itemID);
        shoppingCart.initMethod();
    }

    @Override
    public ShoppingCart getCart() {
        return this.shoppingCart;
    }

}



