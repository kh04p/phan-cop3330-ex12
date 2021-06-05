/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class interest {
    public static double calculateSimpleInterest(double rate, double principal, int years) {
        return principal * (1 + (rate / 100) * years);
    }

    public static void calculateYearlyInterest(double rate, double principal, int years) {
        for (int i = 1; i <= years; i++) {
            double output = principal * (1 + (rate / 100) * i);
            System.out.printf("The investment will be worth $%.2f at %.2f%% after year %d.%n", output, rate, i);
        }
    }
}
