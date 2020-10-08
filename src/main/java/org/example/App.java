package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {


    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        List<String> result = new ArrayList<>();
        Arrays
                .stream(str.split(" "))
                .collect(Collectors.toList())
                .forEach(s -> {
                    StringBuilder sb = new StringBuilder();
                    sb
                            .append(s.substring(1))
                            .append(s.charAt(0));
                    if (!s.matches("[.!?\\\\-]")){
                        sb.append("ay");
                    }
                    result.add(sb.toString());
                });
        return String.join(" ", result);
    }

}
