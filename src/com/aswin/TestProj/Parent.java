package com.aswin.TestProj;

public class Parent {
    public int val = 20;
    public int func(){return 10;}

    @Override
    public boolean equals(Object o){
        if(o instanceof Parent){
            Parent p = (Parent) o;
            return this.val == p.val;
        }
        return false;
    }
}
