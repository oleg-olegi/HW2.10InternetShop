package com.example.hw2_10internetshop.cart;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class ShoppingCart {
    private List<Integer> itemID;

    public ShoppingCart() {
        this.itemID = new ArrayList<>();
    }

    public void addItemToCart(Integer itemID) {
        this.itemID.add(itemID);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemID=" + itemID +
                '}';
    }

    public List<Integer> getItemID() {
        return this.itemID;
    }

    public void initMethod() {
        System.out.println("Bean  is created");
    }
}
