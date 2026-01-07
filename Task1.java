import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) { 
          
        Scanner sc = new Scanner(System.in);
        

        // Sum of N Natural numbers

        /**
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1;i<=num;i++){
            sum =sum+i;
        }
        System.out.println("Sum of the numbers upto "+(num)+" is :"+(sum));
        */

        //  Greatest of 2 and 3 numbers

        /**
        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3: ");
        int num3 = sc.nextInt();
        if (num1 > num2){
            if(num1 > num3){
                System.out.println("The number "+(num1)+" is big");

            }
            else{
                System.out.println("The number "+(num3)+" is big");
            }
            
        }
        else if(num2 > num3){
            System.out.println("The number "+(num2)+" is big");
        } 
        */

        // Simple calculator
        /** 
        System.out.println("Enter first number: ");
        int a = sc.nextInt();   
        System.out.println("Enter first number: ");
        int b = sc.nextInt();   
        System.out.println("Enter an operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("The Sum is:"+(a+b));
                break;
            case '-':
                System.out.println("The Difference is :"+ (a-b));
                break;
            case '*':
                System.out.println("The Difference is :"+ (a*b));
                break;
            case '/':
                System.out.println("The Difference is :"+ (a/b));
                break;
            case '%':
                System.out.println("The Difference is :"+ (a/b));
                break;
            default:
                System.out.println("Invalid Operator");    

        }
        */
        sc.close();

    }
}
