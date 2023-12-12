package com.aswin.TestProj;

import java.util.UUID;

public class Payment {
    private final CreditCard creditCard;
    private final UUID transactionID;
    private int val;

    public Payment(CreditCard creditCard, UUID transactionID, int val){
        this.creditCard = creditCard;
        this.transactionID = transactionID;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", transactionID=" + transactionID +
                ", val=" + val +
                '}';
    }
}
