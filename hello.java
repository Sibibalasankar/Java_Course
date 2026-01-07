
class hello{
    public static void main(String[] args) {
        // Left Shift Operator
        int x = 10,y=3,z;
        z=x<<1;
        System.out.println("Value of Z is : " + x);
        System.out.println("Value of Z after left shift is : " + z);
        System.out.println("*******************************");
        // Right Shift Operator
        z=x>>1;
        System.out.println("Value of Z is : " + x);
        System.out.println("Value of Z after right shift is : " + z);
        System.out.println("*******************************");
        // Unsigned Right Shift Operator
        z=y>>>1;
        System.out.println("Value of Z is : " + x);
        System.out.println("Value of Z after unsigned right shift is : " + z);
        System.out.println("*******************************");



    }
}