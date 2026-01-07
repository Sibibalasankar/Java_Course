class Calculator{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

public class MethodInJava {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        c.sum(10, 20);
        c.sum(10, 20,88);
    }
}
