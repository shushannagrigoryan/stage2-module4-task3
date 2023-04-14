package com.mjc.stage2.impl;


import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MaxPriceFilteringStrategy {
    private double maxPrice;

    // Write your code here!

    public boolean filter(Product product){
        return product.getPrice() == maxPrice;
    }
}
