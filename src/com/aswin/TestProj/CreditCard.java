package com.aswin.TestProj;

import java.util.Optional;
import java.util.UUID;

public class CreditCard {
    private final long ccNumber;

    public CreditCard(long ccNumber){
        this.ccNumber = ccNumber;
    }

    public Optional<Payment> makePayment(int val){
        if(Math.random() > 0.3){
            return Optional.of(new Payment(this, UUID.randomUUID(), val));
        }else{
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ccNumber=" + ccNumber +
                '}';
    }
}
