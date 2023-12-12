package com.aswin.TestProj;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){return this.product;}

    public int getPrice(){return this.product.getPrice() * quantity;}

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
