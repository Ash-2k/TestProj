package com.aswin.TestProj;

public class Order {
    private final Customer customer;
    private final ShoppingCart cart;
    private final Payment payment;

    public Order(Customer customer, ShoppingCart cart, Payment payment){
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    public ShoppingCart getCart(){return this.cart;}

    @Override
    public String toString() {
        return "Order{" +
                "\n customer=" + customer +
                ",\n cart=" + cart +
                ",\n payment=" + payment +
                "\n}";
    }
}
