package com.aswin.TestProj;

// Need to make the class abstract if it includes abstract methods
public abstract class Abstract_demo {
    int val;

    public int func1(){
        return 20 * this.func();
    }

    // Need to override
    public abstract int func();
}
