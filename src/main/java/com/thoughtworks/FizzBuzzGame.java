package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {

    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(reportNumber(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    String isHave3(int i) {
        String string = String.valueOf(i);
        char[] chars = string.toCharArray();
        for (int j = 0; j < string.length(); j++) {
            if (chars[j] == '3') {
                return "Fizz";
            }
        }
        return "";
    }


    String isMultiple3(int test) {
        if (test % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    String isMultiple5(int test) {
        if (test % 5 == 0) {
            return "Buzz";
        }
        return "";

    }

    String isMultiple7(int test) {
        if (test % 7 == 0) {
            return "Whizz";
        }
        return "";
    }

    String reportNumber(int test) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(isHave3(test));
        if (stringBuilder.length() == 0) {
            stringBuilder
                    .append(isMultiple3(test))
                    .append(isMultiple5(test))
                    .append(isMultiple7(test));
        }
        return stringBuilder.toString().equals("") ? String.valueOf(test) : stringBuilder.toString();
    }
}


