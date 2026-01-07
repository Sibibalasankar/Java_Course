import java.util.*;

public class Task5 {
    // Find the ASCII value of a character
    static void FindAscii(Scanner sc) {
        System.out.println("Enter a Character:");
        char ch = sc.next().charAt(0);
        int result = ch;
        System.out.println(result);
    }

    // Remove vowels from a string
    static void RemoveVow(Scanner sc) {
        System.out.println("Enter a String: ");
        String str = sc.next();
        str = str.replaceAll("[AEIUOaeiou]", "");
        System.out.println(str);
    }

    // Check whether a character is alphabet or not
    static void CheckAlpha(Scanner sc){
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        int val = ch;
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch<= 122)){
            System.out.println("The Given Character is Alphabet");
        }
        else{
            System.out.println("The Given Character is Not a Alphabet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // FindAscii(sc);
        // RemoveVow(sc);
        CheckAlpha(sc);
        sc.close();
    }
}
