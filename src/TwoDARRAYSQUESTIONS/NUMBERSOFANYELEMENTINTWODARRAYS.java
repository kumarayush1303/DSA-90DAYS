package TwoDARRAYSQUESTIONS;

public class NUMBERSOFANYELEMENTINTWODARRAYS {
    public static int numberofseven(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[][] array = {
                {4,7,8},
                {8,8,7}
        };
        System.out.println(numberofseven(array));
    }
}
