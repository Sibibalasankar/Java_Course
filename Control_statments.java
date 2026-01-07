
/** Positive or negative number
    Odd or Even Number
    Largest of two numbers
    Eligible to vote or not based on age */

import java.util.Scanner;

public class Control_statments {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            // System.out.println("Enter Number 1:");
            // int num1 = input.nextInt();
            // System.out.println("Enter number 2:");
            // int num2 = input.nextInt();
            // System.out.println("Enter your Age:");
            // int age = input.nextInt();

            // if (num1 < 0) {
            // System.out.println("The Given Number is Negative");
            // }
            // else if (num1 >0 ){
            // System.out.println("The given Number is Positive");
            // }
            // else{
            // System.out.println("The Number is 0");
            // }

            // if (num1 % 2 == 0) {
            // System.out.println("Then Given Numeber is Even");
            // }
            // else {
            // System.out.println("The given Number is Odd");
            // }

            // if (num1 < num2 ){
            // System.out.println("The Number "+ num2 + " is big");
            // }
            // else{
            // System.out.println("The Number "+ num1 + " is Big");
            // }

            // if (age < 18) {
            //     System.out.println(
            //             "You are not eligible to vote. You need to wait for " + (18 - age) + " more years to vote!");
            // } else {
            //     System.out.println("You are Eligible to vote.Go ahead and Vote for TVK!!");
            // }

            // System.out.println("Enter your Choice (1-7): ");
            // int choice = input.nextInt();

            // switch (choice) {
            //     case 1:
            //         System.out.println("Sunday");
            //         break;
            //     case 2:
            //         System.out.println("Monday");
            //         break;
            //     case 3:
            //         System.out.println("Tuesday");
            //         break;
            //     case 4:
            //         System.out.println("Wednesday");
            //         break;
            //     case 5: 
            //         System.out.println("Thursday");
            //         break;
            //     case 6:
            //         System.out.println("Friday");
            //         break;
            //     case 7:
            //         System.out.println("Saturday");
            //         break;            
            //     default:
            //         System.out.println("Invalid Choice");
            //         break;
            // }

            System.out.println("Enter a character");
            char ch = input.next().charAt(0);
            switch(ch){
                
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("The Given Character"+(ch)+" is Vowel");
                    break;
                default:
                    System.out.println("The Given Character"+(ch)+" is Consonant");
                    break;    
            }


            input.close();

        } catch (Exception e) {
            System.out.println("Something is Wrong! - " + e);
        }
    }
}