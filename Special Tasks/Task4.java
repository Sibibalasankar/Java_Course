import java.util.*;

public class Task4 {

    public static String acc_no, pin;
    private static String name;
    private static int bal = 20000;

    Task4(Scanner sc) {
        String acc_no, pin;
        String name;
        System.out.println("Enter Your Account No: ");
        acc_no = sc.next();
        if (acc_no.length() == 12) {
            System.out.println("Enter Your Pin No: ");
            pin = sc.next();
            if (pin.length() == 4) {
                System.out.println("Enter Your Name: ");
                name = sc.next();
                if (name.length() <= 17) {
                    this.acc_no = acc_no;
                    this.pin = pin;
                    this.name = name;
                } else {
                    System.out.println("Invalid Name!");
                }
            } else {
                System.out.println("Invalid Pin");
            }
        } else {
            System.out.println("Invalid Account Number!");
        }
    }

    static void Withdraw(int amount) {
        if (amount > bal || amount > 25000) {
            System.out.println("Unable to Complete the transaction!");
        } else {
            bal -= amount;
            System.out.println("Transaction Completed! Your Current balance is: " + bal);
        }
    }

    static void Deposite(int amount) {
        if (amount <= 0) {
            System.out.println("Unable to Complete the transaction!");
        } else {
            bal += amount;
            System.out.println("Transaction Completed! Your Current balance is: " + bal);
        }
    }

    static boolean validate(String uacc_no, String upin_no) {
        if (uacc_no.equals(acc_no) && upin_no.equals(pin)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task4 task = new Task4(sc);
        System.out.println("Enter a Account Number: ");
        String uacc_no = sc.next();
        System.out.println("Enter a Pin Number: ");
        String upin_no = sc.next();
        if (validate(uacc_no, upin_no)) {
            System.out.println("Welcome " + name);
            System.out.println("Enter Your Choice: \n1. Withdraw \n2. Deposite");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter the amount to Withdraw: ");
                int amount = sc.nextInt();
                Withdraw(amount);
            } else if (ch == 2) {
                System.out.println("Enter the amount to Deposite:");
                int amount = sc.nextInt();
                Deposite(amount);
            } else {
                System.out.println("Invalid Option!");
            }
        } else {
            System.out.println("Invalid credetials");
        }
        sc.close();
    }
}
