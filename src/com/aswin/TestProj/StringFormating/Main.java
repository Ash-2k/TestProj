package com.aswin.TestProj.StringFormating;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
//        List<String> words = List.of(new String[]{"one", "two", "three", "four", "five"});
//        StringJoiner sb = new StringJoiner("], [", "[", "]");
//        sb.add("one").add("two").add("three").add("four").add("five");
//        sb.setEmptyValue("empty");
//        System.out.println(sb.toString());
//
//        String temp1 = String.format("values are %d, %d, %d, %d", 1, 2, 3, 4);
//        String temp2 = String.format("double: %.2f", 1.0d);
//        String temp3 = String.format("hex: %#x", 32);
//        String temp4_1 = String.format("Right align: %4d, %4d", 20, 100);
//        String temp4_2 = String.format(" Left align: %-4d, %-4d", 20, 100);
//        String temp5 = String.format("Commas: %,d", 1000000);

//        try{
//            formatWriter();
//        }catch(Exception ex){
//            System.out.println("Error: " + ex.getMessage());
//        }

        String s1 = "apple, apple please";
        String s2 = s1.replaceAll("ple\\b", "ricot");
        System.out.println(s2);

//        At-least 2 string characters
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s1);
        while(matcher.find())
            System.out.println(matcher.group());
    }

    public static void formatWriter() throws IOException {
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get("data.txt"));
            Formatter f = new Formatter(bw)){
            f.format("Format into file: %d, %.2f, %s\n", 10, 10.0, "10");
            f.format("this writes into the opened file\n");
        }catch(Exception ex){
            System.out.println("Error opening file - " + ex.getMessage());
        }
    }
}
