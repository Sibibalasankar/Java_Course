import java.util.Scanner;
class Pattern1 {
    public static void display() {
        int n = 5;
        int space = 0;
        for (int i = 0; i < n; i++) {
            space = n - (i + 1);
            for (int j = 0; j < n; j++) {
                if (j < space) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// Triangle
class Pattern2 {
    public static void display() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - (i + 1)); s++) {
                System.out.print(" ");

            }
            for (int j = 0; j < ((i * 2) + 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Diamond
class Pattern3 {
    public static void display(Scanner sc) {
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i - 1) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i - 1) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pattern3.display(sc);
        Pattern2.display();
        sc.close();
    }
}