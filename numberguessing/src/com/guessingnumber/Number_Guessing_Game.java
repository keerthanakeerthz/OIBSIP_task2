package com.guessingnumber;
import java.util.Scanner;
public class Number_Guessing_Game {

	public static void main(String[] args) 
    {
        guessingNumber();
    }
    public static void guessingNumber()
    {
        Scanner sc = new Scanner(System.in);
        int generatedNumber=1+(int)(100*Math.random());
        int max_attempts=5;
        int userGuess,i;
        System.out.println("~~~~~~~~~~WELCOME TO NUMBER GUESSING GAME~~~~~~~~~~");
        System.out.println("                   How To Play                     ");
        System.out.println("----------------------------------------------------");
        System.out.println("* You have To Guess A Number Between 1 to 100");
        System.out.println("* The total attempts is FIVE");
        System.out.println("----------------------------------------------------");
        for( i=0;i<max_attempts;i++)
        {
            System.out.print("Enter your Guess:");
            userGuess = sc.nextInt();
            if ( generatedNumber ==userGuess)
                {    
                    System.out.println("Whoopee..!,that's the correct number,you made it..!");
                    break;
                }
                else if ( generatedNumber>userGuess && i!=max_attempts-1)
                    System.out.println("Oops,the generated number is greater than "+ userGuess);
                else if (generatedNumber<userGuess && i!=max_attempts-1)
                    System.out.println("Oops,the generated number is less than "+userGuess);
        }
        if(i==max_attempts) 
        {
        	System.out.println("Sorry,You have reached the maximum attempt.");
            System.out.println("The generated number was:"+generatedNumber);
            System.out.println("Better Luck Next Time..!!");
        }
        
    }
}