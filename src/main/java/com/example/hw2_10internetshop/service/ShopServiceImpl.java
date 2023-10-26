package com.example.hw2_10internetshop.service;

import com.example.hw2_10internetshop.cart.ShoppingCart;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShoppingCart shoppingCart;


    @Override
    public void addItemToCart(List<Integer> itemID) {
        for (Integer itemIDs : itemID) {
            shoppingCart.addItemToCart(itemIDs);
        }
        shoppingCart.initMethod();
    }

    @Override
    public List<Integer> getCart() {
        return this.shoppingCart.getItemID();
    }

}



