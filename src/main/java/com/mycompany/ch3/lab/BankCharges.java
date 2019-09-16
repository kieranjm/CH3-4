/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch3.lab;

import java.util.Scanner;

/**
 *
 * @author kjm61
 */
public class BankCharges {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double base = 10;
        double checks = 0;
        double total = 0;
        
        System.out.println("How many checks did you write this month?");
        checks = keyboard.nextFloat();
        
        if (checks < 20)
        {
            total = base + (checks * 0.1);
            System.out.println("Service fees: $" + total);
        }
        else if (checks >= 20 && checks <= 39)
        {
            total = base + (checks * 0.08);
            System.out.println("Service fees: $" + total);
        }
        else if (checks >= 40 && checks <= 59)
        {
            total = base + (checks * 0.06);
            System.out.println("Service fees: $" + total);
        }
        else if (checks > 60)
        {
            total = base + (checks * 0.04);
            System.out.println("Service fees: $" + total);
        }
    }
            
}
