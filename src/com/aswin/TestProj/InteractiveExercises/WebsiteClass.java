package com.aswin.TestProj.InteractiveExercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebsiteClass {
    private List<String> urlList;
    public WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public void printURLs() {
        urlList.addAll(Arrays.asList("https://pluralsight.com/search?q=java",
        "https://medium.com/search?q=java",
        "https://stackoverflow.com/questions/tagged/java",
        "https://stackoverflow.com/search?q=java+list",
        "https://reddit.com/r/java",
        "https://reddit.com/r/javahelp"));

//        System.out.println(urlList);

        urlList.stream().filter(temp -> temp.contains("stackoverflow.com")).forEach(System.out::println);

        boolean result = urlList.remove("https://medium.com/search?q=java");
        System.out.println("Removed Medium result: "+result);
        System.out.println(urlList);

        urlList.sort(null);
        System.out.println(urlList);

        List<String> firstTwo = urlList.subList(0,2);
        int remaining = urlList.size()-2;
        System.out.println(firstTwo + "\nAnd " + remaining + " more");
        List<String> remainingUrls = urlList.subList(2,urlList.size());
        System.out.println(remainingUrls);
    }
}
