/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch3.lab;

import java.util.Scanner;

/**
 *
 * @author Kieran Martin
 */
public class SumOfNumbers {
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        
        System.out.println("Pick a positive number bigger than zero.");
        counter = keyboard.nextInt();
        
        for (int i=1; i <= counter; i++)
        {
            sum = i + sum;
        }
        
        System.out.println("The added sum of every number up to " + counter + " is " + sum);    
    }
}
