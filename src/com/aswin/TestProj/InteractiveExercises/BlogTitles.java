package com.aswin.TestProj.InteractiveExercises;
import com.sun.jdi.event.StepEvent;

import java.util.*;

public class BlogTitles {
    private Set<String> javaTitles;
    private Set<String> webTitles;

    public BlogTitles() {
        javaTitles = new HashSet<>();
        webTitles = new HashSet<>();
    }

    public void initalizeTitles() {
        javaTitles.addAll(Arrays.asList("Leveraging Java Data Structures","Java Lambdas: Getting Started", "My First Spring Boot App", "Spring Boot and React"));
        webTitles.add("Creating the Same App with React and Angular");
        webTitles.add("Learn Kubernetes in Under 4 Hours");
        webTitles.add("My First Spring Boot App");
        webTitles.add("Spring Boot and React");

        Set<String> intersection = new HashSet<>(javaTitles);
        intersection.retainAll(webTitles);
        System.out.println(intersection);

        Set<String> strictlyJavaSet = new HashSet<>(javaTitles);
        strictlyJavaSet.removeAll(webTitles);
        System.out.println(strictlyJavaSet);

        Set<String> union = new TreeSet<>(javaTitles);
        union.addAll(webTitles);
        System.out.println(union);
    }
}