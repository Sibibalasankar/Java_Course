import java.util.*;

public class Task3 {

    // print each char of the string
    static void PrintChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    // count the char of the string
    static void CountChars(String str) {
        String str1 = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            String str2 = "" + (str.charAt(i));
            if (str1.contains(str2)) {
                continue;
            } else {
                str1 = str1 + str.charAt(i);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {

                        count++;
                    }
                }
            }
            System.out.println(str.charAt(i) + " -> " + count);
        }
    }

    static void SubString(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int l1 = (str.substring(i, j)).length();
                int max = 0;
                if (l1 > max) {
                    result = str.substring(i, j);
                    max = l1;
                    System.out.println(result);
                }
            }

        }
        // System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        // PrintChar(str);
        // CountChars(str);
        SubString(str);
        sc.close();
    }
}