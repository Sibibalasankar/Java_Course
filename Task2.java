package Basic_java;

import java.util.Scanner;

class PrimeNumbers {
    public static void prime() {
        // 1. Print numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class EvenNumbers {
    public static void even() {
        // 2. Print Even numbers 50 to 100
        for (int i = 50; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

class FactorialNumber {
    public static void factorial(Scanner scanner) {
        // 3. Factorial Number
        int fact = 1;

        System.out.println("Enter a number to find factorial: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is : " + fact);

    }
}

class Tables {
    public static void table(Scanner scanner) {
        // 4. Tables using for loop

        System.out.println("Enter a number for table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }

    }
}

class OddNumbers {
    public static void odds() {
        // 5. Print Odd nos 1 to 30 using while loop
        int i = 1;
        while (i <= 30) {
            System.out.println(i);
            i += 2;
        }

    }
}

class SquareNumbers{
    public static void squares(){
        for(int i=1;i<=10;i++){
            System.out.println(i*i);
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(50));
        PrimeNumbers.prime();
        System.out.println("=".repeat(50));
        EvenNumbers.even();
        System.out.println("=".repeat(50));
        FactorialNumber.factorial(scanner);
        System.out.println("=".repeat(50));
        Tables.table(scanner);
        System.out.println("=".repeat(50));
        OddNumbers.odds();
        System.out.println("=".repeat(50));
        SquareNumbers.squares();

        scanner.close();

    }
}