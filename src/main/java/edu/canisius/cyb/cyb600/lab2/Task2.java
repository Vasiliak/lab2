package edu.canisius.cyb.cyb600.lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public String method1(String parameter1){
        if (parameter1 == null) {
            return "";
        }

        if (parameter1.isEmpty()) {
            return parameter1;
        }

        // Reverse the string
        StringBuilder reversed = new StringBuilder(parameter1).reverse();

        // Convert to uppercase
        String UpperCase = reversed.toString().toUpperCase();
        parameter1 = UpperCase;

        return parameter1;
    }

    public String method2(String parameter2){
        if (parameter2 == null) {
            return "";
        }

        if (parameter2.isEmpty()) {
            return parameter2;
        }

        StringBuilder result = new StringBuilder();
        char c = parameter2.charAt(0);

        for (int i = 0; i < parameter2.length(); i++) {
            result.insert(0, c);
        }

        for (int i = 0; i < parameter2.length(); i++) {
            result.append(parameter2.charAt(i));
        }

        parameter2 = result.toString();
        return parameter2;
    }

    public String method3(String parameter3){
        if (parameter3 == null) {
            return "";
        }

        if (parameter3.isEmpty()) {
            return parameter3;
        }

        String[] words = parameter3.split("\\s+");
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);

        parameter3 = String.join(" ", wordList);
        return parameter3;
    }
}
