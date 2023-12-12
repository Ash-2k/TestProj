package com.aswin.TestProj;

public class Inheritance_demo {
    public static void main(String[] args){
        Parent p1 = new Parent();
        // Parent fields but child methods
        Parent p2 = new Child();
        Child c1 = new Child();

//        System.out.println(p1.val + " " + p2.val + " " + c1.val + " " + p1.func() + " " + p2.func() + " " + c1.func());
        Object o = new Parent();
//        if(o instanceof Parent){
//        if(c1 instanceof Parent){
//            Parent p3 = (Parent) o;
//            System.out.println(p3.val);
//        }

        System.out.println(p1.equals(p2) + " " + p1.equals(c1));
    }
}
