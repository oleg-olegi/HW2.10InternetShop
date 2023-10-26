package com.example.hw2_10internetshop.controller;

import com.example.hw2_10internetshop.cart.ShoppingCart;
import com.example.hw2_10internetshop.service.ShopServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class ShopController {

    private final ShopServiceImpl shopServiceImpl;

    @GetMapping("/add")
    public Integer addItemToCart(@RequestParam Integer itemID) {
        shopServiceImpl.addItemToCart(itemID);
        return itemID;
    }


}


