package com.mjc.stage2;

import java.util.List;

public class ShopStock {
    private FilteringStrategy filteringStrategy;
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    // Write your code here!

    public List<Product>  executeFilteringStrategy(FilteringStrategy filteringStrategy){
        for (Product item: productList) {
            if(filteringStrategy.filter(item)){
                productList.remove(item);
            }
        }

        return productList;
    }
}
