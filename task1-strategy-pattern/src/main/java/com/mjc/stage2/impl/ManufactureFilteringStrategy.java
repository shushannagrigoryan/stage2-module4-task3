package com.mjc.stage2.impl;


import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManufactureFilteringStrategy {
    private String manufacture;

    // Write your code here!
    public boolean filter(Product product){
        return product.getManufacture().equals(manufacture);
    }

}
