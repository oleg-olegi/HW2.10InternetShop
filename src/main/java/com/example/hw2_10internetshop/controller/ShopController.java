package com.example.hw2_10internetshop.controller;

import com.example.hw2_10internetshop.service.ShopServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class ShopController {

    private final ShopServiceImpl shopServiceImpl;

    @GetMapping("/add")
    public String addItemToCart(@RequestParam(value = "itemID") List<Integer> itemID) {
        shopServiceImpl.addItemToCart(itemID);
        return "Items added to the cart: " + itemID;
    }

    @GetMapping("/get")
    public List<Integer> getShoppingCart() {
        return shopServiceImpl.getCart();
    }
}


