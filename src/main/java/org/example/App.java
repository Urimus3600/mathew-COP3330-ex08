/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "How many people? " );
        int ppl = input.nextInt();
        System.out.print( "How many pizzas do you have? " );
        int pizza = input.nextInt();
        System.out.print( "How many slices per pizza? " );
        int slices = pizza * input.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)%n", ppl, pizza, slices);
        System.out.print("Each person gets " + (slices / ppl) +" pieces of pizza.\n"+
                "There are "+ (slices % ppl) + " leftover pieces.");
    }
}
