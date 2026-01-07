public class DiagonalAddition {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 2, 9, 4 }, { 3, 4, 8 } };
        System.out.println("Given matrix is: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<mat.length;i++){
            sum1 += mat[i][i];
            sum2 += mat[i][mat.length-1-i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum1+sum2);

    }
}
