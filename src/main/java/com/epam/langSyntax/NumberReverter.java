package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        String result = "";
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
