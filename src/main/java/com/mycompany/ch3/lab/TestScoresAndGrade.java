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
public class TestScoresAndGrade {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float testA = 0;
        float testB = 0;
        float testC = 0;
        float average = 0;
        
        System.out.println("Enter your first test score.");
        testA = keyboard.nextFloat();
        System.out.println("Enter your second test score.");
        testB = keyboard.nextFloat();
        System.out.println("Enter your third test score.");
        testC = keyboard.nextFloat();
        average = (testA + testB + testC)/3;
        
        if (average >= 90 && average <= 100)
        {
            System.out.println("Your average score was " + average + ". You got an A!");
        }
        else if (average >= 80 && average < 90)
        {
            System.out.println("Your average score was " + average + ". You got a B.");
        }
        else if (average >= 70 && average < 80)
        {
            System.out.println("Your average score was " + average + ". You got a C.");
        }
        else if (average >= 60 && average < 70)
        {
            System.out.println("Your average score was " + average + ". You got a D. Oof.");
        }
        else if (average < 60)
        {
            System.out.println("Your average score was " + average + ". You got an F. Yikes, mate.");       
        }
    
        
    }
}
