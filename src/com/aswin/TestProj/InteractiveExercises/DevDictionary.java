package com.aswin.TestProj.InteractiveExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DevDictionary {

    private Map<String, String> dictionary;

    public DevDictionary() {
        dictionary = new HashMap<>();
        dictionary.put("SEO","Search engine optimization");
        dictionary.put("SaaS","Software as a service");
        dictionary.put("UX","User experience");
    }

    public void print(){
//        dictionary.forEach((key,value)->System.out.printf("%s: %s\n",key,value));
        dictionary.entrySet().forEach(entry -> System.out.printf("%s: %s\n",entry.getKey(), entry.getValue()));
    }

    public void runApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lookup word or Q to quit");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Thanks for using Dev Dictionary");
                return;
            }
            if(!dictionary.containsKey(input)){
                System.out.println("Word doesn't exist, try again or Q to quit");
            }else{
                System.out.printf("%s: %s\n",input, dictionary.get(input));
            }
        }
    }
}
