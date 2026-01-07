import java.util.Scanner;

class Smallest {
    public static void check(Scanner sc) {
        System.out.println("Enter the Size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:" + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The Given Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Smallest Element among the Given Array is: " + min);

    }
}

class Largest{
     public static void check(Scanner sc) {
        System.out.println("Enter the Size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:" + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The Given Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Largest Element among the Given Array is: " + max);

    }
}
public class ArrayElementsMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Smallest.check(sc);
        Largest.check(sc);
    }
}
