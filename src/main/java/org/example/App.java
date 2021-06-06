/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String text;
        double principal, rate, years, n, total;

        System.out.print("What is the principal amount? ");
        text = input.nextLine();
        principal = Double.parseDouble(text);
        System.out.print("What is the rate? ");
        text = input.nextLine();
        rate = Double.parseDouble(text);
        System.out.print("What is the number of years? ");
        text = input.nextLine();
        years = Double.parseDouble(text);
        System.out.print("What is the times the interest is compounded per year? ");
        text = input.nextLine();
        n = Double.parseDouble(text);

        total = Math.pow((1+((rate/100) / n)),(n*years)) * principal;
        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", principal, rate, years, n, total);
    }
}
