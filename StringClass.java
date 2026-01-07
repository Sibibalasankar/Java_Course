import java.util.Scanner;
public class StringClass{
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Welcome! "+str);
        System.out.println("Length of the String is: "+str.length());
        System.out.println("LowerCase of the String is: "+str.toLowerCase());
        System.out.println("UpperCase of the String is: "+str.toUpperCase());
        System.out.println("Trim of the String is: "+str.trim());
        sc.close();
    }
}