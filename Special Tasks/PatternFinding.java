import java.util.Scanner;

public class PatternFinding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int width = sc.nextInt();
        int[] arr = new int[limit];
        int result =0;
        for (int i = 0 ; i<arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<=arr.length - width;j++){
            result = 0;
            for(int k=0;k<width;k++){
                result = result + arr[j + k];
            }
            result = result / width;
            System.out.print(result + " ");

        }
        sc.close();
    }
}
