public class MatrixSum {
    public static void main(String args[]) {
        int a[][] = {{1, 2, 3},{1,1,2},{2,3,4}};
        int b[][] = {{1, 1, 1},{2, 2, 2},{3, 3, 3}};
        int sum[][] = new int[3][3];
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for (i = 0; i < sum.length; i++) {
            for (j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

