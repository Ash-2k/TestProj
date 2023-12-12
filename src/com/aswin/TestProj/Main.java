package com.aswin.TestProj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        long temp1 = 100000000000L;
        float temp2 = 12.45f;
        double temp3 = 10.24;
        double temp4 = 10.24d;
        boolean flag = false;

//        int a = 10;
//        float b = 10.3f;
//        System.out.println((int)b);
//        System.out.println((float)a);

//        if(flag) System.out.println("Hello");
//        else System.out.println("Everynyan");
//

//        temp = 0;
//        if(temp > 0){
//            System.out.println("Works ig");
//        }else if(temp == 0){
//            System.out.println("Works again ig");
//        }

//        Vector<Integer> a = new Vector<Integer>(10);
//        tempMethod(a);
//        System.out.println(a);
//        for(int i=0;i<10;i++) a.add(i);
////        for(int i=0;i<10;i++) System.out.print(" " + a.get(i));
//        System.out.println(a);

//        int[] a = new int[5];
//        int[] a = {1, 2, 3, 4, 5};
//        var == auto
//        for(var i:a) System.out.print(" " + i);

//        int i = 0;
//        do {
//            System.out.println(i++);
//        }while(i<5);

//        if(args.length > 0){
//            System.out.println(Integer.parseInt(args[0]));
//        }
//        System.out.println(args);

//        Take input
//        Scanner scanner = new Scanner(System.in);
//        String userinput = scanner.nextLine();
//        String[] parts = userinput.split(" ");
//        System.out.println(Arrays.toString(parts));

//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        sb.append("everynyaan, how are you ");
//        sb.append("fine thank you ");
//        sb.append(100);
//        String message = sb.toString();
//        System.out.println(message);

//        String tempString = String.format("Hello everynyaan %d, %f, %.2f, %.1f", temp1, temp2, temp3 ,temp4);
//        System.out.println("Hello everynyaan %d, %f, %.2f, %.1f", temp1, temp2, temp3 ,temp4);
//        System.out.println(tempString);

        // Final - const
//        final int temp2 = 100;

        String temp = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append(temp).append(temp);
        System.out.println(sb.toString());
        


        return;
    }

    static void tempMethod(Vector<Integer>a){
        for(int i=0;i<5;i++) a.add(i+10);
        return;
    }
}