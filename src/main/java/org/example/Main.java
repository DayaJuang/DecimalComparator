package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        boolean ans = areEqualByThreeDecimalPlaces(-3.175656, -3.175);

        System.out.println(ans);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double ans1, ans2;

        BigDecimal bd = new BigDecimal(Double.toString(num1));
        bd = bd.setScale(3, RoundingMode.DOWN);
        ans1 = bd.doubleValue();

        bd = new BigDecimal(Double.toString(num2));
        bd = bd.setScale(3,RoundingMode.DOWN);
        ans2 = bd.doubleValue();

        return (ans1 == ans2);
    }
}