package com.aswin.TestProj;

enum ProductType {
    PHYSICAL(5), DIGITAL(0);
    private final int shippingRate;

    ProductType(int shippingRate){
        this.shippingRate = shippingRate;
    }

    public int getShippingPrice(int weight){
        return this.shippingRate * weight;
    }

}
