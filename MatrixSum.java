package Basic_java;
import java.util.Scanner;

class MatSum {
    public static void sum() {
        int[][] m1 = { { 1, 2, 3 }, { 3, 2, 4 } };
        int[][] m2 = { { 2, 3, 4 }, { 5, 4, 3 } };
        int sum[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(sum[k][l] + " ");
            }
            System.out.println(" ");
        }
    }
}

class MatProd {
    public static void product(Scanner sc) {
        System.out.println("Enter the number of rows and columns for Matrix 1:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the number of rows and columns for Matrix 1:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] m1 = new int[a][b];
        int[][] m2 = new int[n][m];
        int[][] result = new int[a][m];
        if (b == n) {
            System.out.println("Matrix Multiplication Proceeded!");
            System.out.println("Enter the First Matrix Element:");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the Second Matrix Element:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            // Matrix Multiplication Logic
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = 0;
                    for(int k= 0;k<b;k++){
                        result[i][j] = m1[i][k]+m2[k][j];
                    }
                }
            }

            System.out.println(" The Matrix Multiplication result:");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Matrix Multiplication Not possible");
        }

    }
}

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatProd.product(sc);
    }
}
