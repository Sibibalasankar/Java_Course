class pattern1 {
    public static void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class pattern2 {
    public static void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
class pattern3 {
    public static void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
class pattern4 {
    public static void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
class pattern5 {
    public static void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print( i*j + " ");
            }
            System.out.println();
        }
    }
}

public class NestedLoop {
    public static void main(String[] args) {
        pattern1.display();
        pattern2.display();
        pattern3.display();
        pattern4.display();
        pattern5.display();
    }
}
