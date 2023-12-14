package com.aswin.TestProj.Properties;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static void main(String[] args){
//        writeMain();
//        readMain();
//        defaultMain();
        useDefaultMain();
    }

    public static void writeMain(){
        Properties props = new Properties();
        props.setProperty("displayName", "John Doe");
        props.setProperty("accountNumber", "123-456-789");
        props.setProperty("val1", "blah1");
        props.setProperty("val2", "blah2");

//        try(Writer writer = Files.newBufferedWriter(Paths.get("xyz.properties"))){
//            props.store(writer, "My comment");
//        }catch(Exception ex){
//            System.out.println("Error: " + ex.getMessage());
//        }

        try(OutputStream output = Files.newOutputStream(Paths.get("props.xml"))){
            props.storeToXML(output, "My comment");
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void readMain(){
        Properties props = new Properties();

//        try(BufferedReader reader = Files.newBufferedReader(Paths.get("xyz.properties"))){
//            props.load(reader);
//        }catch(Exception ex){
//            System.out.println("Error: " + ex.getMessage());
//        }

        try(InputStream input = Files.newInputStream(Paths.get("props.xml"))){
            props.loadFromXML(input);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }

        String val1 = props.getProperty("val1");
        System.out.println(val1);
    }

    public static void defaultMain(){
        Properties defaults = new Properties();
        defaults.setProperty("position", "1");
        Properties props = new Properties(defaults);
        String nextPos = props.getProperty("position");
        System.out.println(nextPos);
        int iPos = Integer.parseInt(nextPos);
        props.setProperty("position",Integer.toString(++iPos));
        nextPos = props.getProperty("position");
        System.out.println(nextPos);
    }

    public static void useDefaultMain(){
        try{
            Properties defaultProps = new Properties();
            try(InputStream inputStream = Main.class.getResourceAsStream("defaultProps.xml")){
                defaultProps.loadFromXML(inputStream);
            }catch(IOException ex){
                System.out.println("IOException:" + ex.getMessage());
            }

            Properties userProps = new Properties(defaultProps);
            Path userFile = Paths.get("userValues.xml");
            if(Files.exists(userFile)){
                try(InputStream inputStream = Files.newInputStream(userFile)){
                    userProps.loadFromXML(inputStream);
                }
            }

            String welcomeMessage = userProps.getProperty("welcomeMessage");
            String farewellMessage = userProps.getProperty("farewellMessage");

            System.out.println(welcomeMessage + ", " + farewellMessage);

            if(userProps.getProperty("isFirstRun").equalsIgnoreCase("Y")){
                userProps.setProperty("welcomeMessage", "Welcome back");
                userProps.setProperty("farewellMessage", "Things will be familiar now");
                userProps.setProperty("isFirstRun", "N");
                try(OutputStream outputStream = Files.newOutputStream(Paths.get("userValues.xml"))){
                    userProps.storeToXML(outputStream, null);
                }catch(IOException ex){
                    System.out.println("Exception <" + ex.getClass().getSimpleName() + "> " + ex.getMessage());
                }
            }
        }catch(Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
