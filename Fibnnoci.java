import java.util.Scanner;

public class Fibnnoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int num = sc.nextInt();
        int a = 0, b = 1 , c;
        System.out.println("The Fibinocci series is:");
        for (int i = 0; i <= num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
