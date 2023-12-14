package com.aswin.TestProj;

import java.util.*;

import static java.util.Arrays.asList;

public class KC1 {

    public static void main(String[] args){
//        List<Integer> temp1 = findDuplicates(asList(-1,1,null,null,2,5,6,-1,3,6),4);
//        System.out.println(temp1.toString());
//        System.out.println(substring(" one two three  ",1));
        System.out.println(reverse(""));
    }

    public static String reverse(final String input) throws IllegalArgumentException{
        if(input == null) throw new IllegalArgumentException();
        return new StringBuilder(input).reverse().toString();
    }

    public static String substring(final String input, final int index) throws IllegalArgumentException {
        if(input == null) throw new IllegalArgumentException();
        List<String> words = List.of(input.trim().split(" "));
        if(index >= words.size() || index < 1) throw new IllegalArgumentException();
        return words.get(index-1);
    }

    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        Map<Integer,Integer> map = new HashMap<>();
        for(Integer val : integers){
            if(val == null) continue;
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        map.forEach((k,v)->{
            if(v == numberOfDuplicates)
                ans.add(k);
        });
        return ans;
    }

}
