package com.aswin.TestProj;

public class Product {
    private final String name;
    private int price;
    private int discount;
    private int weight;
    private final ProductType type;

    public Product(String name, int price, int discount, ProductType type, int weight){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.weight = weight;
        this.type = type;
    }
    public int getPrice(){
        return (int) Math.round(this.price*(100-discount)/100.0 + type.getShippingPrice(weight));
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
