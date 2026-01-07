import java.util.Scanner;

class FindWord {
    public static void find(Scanner sc) {
        System.out.println("Enter the Number of Rows and Columns:");
        int m = sc.nextInt();
        System.out.println("Enter the Elements:");
        // a l u l k b i m i t j b j m p i a r e l m u k o t
        char arr[][] = new char[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("The given Elements are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the String to find");
        String find = sc.next();
        System.out.println("The Given String is: " + find);

        // Logic to check
        String empstr = "";
        int charInd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                empstr = "";
                charInd = 0;
                if (arr[i][j] == find.charAt(charInd)) {
                    empstr += find.charAt(charInd);
                    for (int k = i; k < m; k++) {
                        charInd++;
                        if (arr[k][j] == find.charAt(charInd)) {
                            break;
                        }
                        empstr += find.charAt(charInd);
                        if(find.equals(empstr)){
                            System.out.println("Found"+empstr + find);
                            break;
                        }
                    }
                }
            }
        }
    }
}

public class WordPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindWord.find(sc);
        sc.close();
    }
}
