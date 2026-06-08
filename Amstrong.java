package Basic_java;
import java.util.Scanner;

class amstr {
    public static void check(Scanner sc) {
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int temp = num;
        int am_num = 0;
        while (num > 0) {
            int r = num % 10;
            am_num = am_num + (r * r * r);
            num = num / 10;
        }
        if (am_num == temp) {
            System.out.printf("The given Number %d is Amstrong", temp);
        } else {
            System.out.printf("The Given Number %d is not a Amstrong", temp);
        }
    }
}

class amstr2 {
    public static void check() {
        int limit = 1000;
        for (int i = 100; i <= limit; i++) {
            int temp = i;
            int am_no = 0;
            while (temp > 0) {
                int r = temp % 10;
                am_no = am_no + (r * r * r);
                temp = temp / 10;
            }
            if (am_no == i ){
                System.out.println(am_no);
            }

        }

    }
}

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        amstr2.check();
        sc.close();
    }
}
