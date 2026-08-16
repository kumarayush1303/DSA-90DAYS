package TwoDARRAYSQUESTIONS;

public class transposeofmatrix {
    public static void main(String[] args) {
        int[][] matrix ={{1,4,9},{11,4,3},{2,2,3}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
