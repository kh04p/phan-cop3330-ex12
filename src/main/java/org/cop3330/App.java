/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

//program calculating investement value after taking in principal, interest rate and years.
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        interest.calculateYearlyInterest(rate, principal, years);
    }
}
