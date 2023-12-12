package com.aswin.TestProj;

import java.util.HashMap;
import java.util.Map;

import static com.aswin.TestProj.ProductType.DIGITAL;
import static com.aswin.TestProj.ProductType.PHYSICAL;

public class Catalogue {
    public final static int SHIPPING_RATE = 5;


    // Java 9 and later
    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3000, 0, PHYSICAL, 400),
            "Baby Alarm", new Product("Baby Alarm", 5000, 0, PHYSICAL, 500),
            "War and Peace (e-book)", new Product("War and Peace (e-book)", 1000, 0, DIGITAL, 0)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
