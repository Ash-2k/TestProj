package com.aswin.TestProj.ErrorHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        main1();
        main2();
//        main2_1();

    }

    public static void main1(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        try {
            int result = randomOperation2(x,y);
            System.out.println("The reusult is: " + result);
        }catch (ArithmeticException ex){
            System.err.println("Arithmetic Error: " + ex.getMessage());
        }catch (Exception ex){
            System.err.println("Error: " + ex.getMessage());
//            ex.printStackTrace();
        }
    }

    public static void main2(){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("RandomText.txt"));
            String inputLine = null;
            while((inputLine = reader.readLine()) != null){
                try{
                    randomOperation(inputLine);
                }catch(InvalidStatementException ex){
                    System.out.println("Error invalid statement - " + ex.getMessage() + " - " + inputLine);
                    if(ex.getCause() != null)
                        System.err.println(" caused by " + ex.getCause());
                }
            }
        }catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }finally {
            try{
                System.out.println("Closing file");
                if(reader != null) reader.close();
            }catch(Exception ex){
                System.err.println("Error closing file");
            }
        }
    }

    public static void main2_1(){
        try(BufferedReader reader = new BufferedReader(new FileReader("RandomText.txt"))){
            fileReading(reader);
        } catch(FileNotFoundException ex){
            System.err.println("Error: No file found");
        } catch(IOException ex){
            System.err.println("Error reading file - " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }

    public static void randomOperation(String s) throws InvalidStatementException{
        try{
            int a = Integer.parseInt(s);
            System.out.println(a);
        }catch(NumberFormatException ex){
            throw new InvalidStatementException(s + " is not a number");
        }
    }

    public static int randomOperation2(int x, int y){
        if(y == 0){
            throw new IllegalArgumentException("Zero rightval not permitted");
        }
        return x/y;
    }

    private static void fileReading(BufferedReader reader) throws IOException{
        String inputLine = null;
        while((inputLine = reader.readLine()) != null){
            try{
                randomOperation(inputLine);
            }catch(InvalidStatementException ex){
                System.err.println("Error invalid statement - " + ex.getMessage());
                if(ex.getCause() != null)
                    System.err.println(" caused by " + ex.getCause());
            }
        }
    }
}
