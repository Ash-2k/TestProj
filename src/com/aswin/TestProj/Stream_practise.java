package com.aswin.TestProj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_practise {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<5;i++) a.add(i);
        var temp = a.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(temp);
    }
}
