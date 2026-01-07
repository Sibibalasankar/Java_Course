public class PatternInJava {
    static void SquareHollowPattern() {
        int row = 6;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row) {
                    System.out.print(" * ");
                } else if (j > i || j < row) {
                    if (j == 1 || j == col) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }

                }
            }
            System.out.println();

        }
    }

    static void NumberTrianglePattern() {
        int row = 4;
        int col = 4;
        for (int i = 1; i <= row; i++) {
            // Space
            for (int s = 1; s <= col - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void NumberIncreasingPyramidPattern() {
        int row = 4;
        int col = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void NumberIncreasingReversePyramidPattern() {
        int row = 4;
        int col = 4;
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void NumberChangingPyramidPattern() {
        int row = 4;
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void ZeroOneTrianglePattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void PalindromeTrianglePattern() {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int k=0;k<2*i-1;k++){
                int value = k  + k-1;
                System.out.print(value + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PalindromeTrianglePattern();
    }
}