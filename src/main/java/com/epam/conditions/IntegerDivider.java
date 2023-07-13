package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0)
            System.out.println("division by zero");
        else {
            int divideResult = dividend / divider;
            if (divideResult * divider == dividend)
                System.out.println("can be divided completely");
            else
                System.out.println("cannot be divided completely");
        }
    }
}
