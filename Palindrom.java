import java.util.Scanner;

class pali {
    public static void check(Scanner sc) {
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.printf("The Given Number %d is Palindrome", sum);

        } else {
            System.out.printf("The Given Number %d is not a Palindrome ", sum);
        }
    }
}

class pali2 {
    public static void check() {
        int num = 150;
        for (int i = 100; i <= num; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pali2.check();
        sc.close();

    }
}
