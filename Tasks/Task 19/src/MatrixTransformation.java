import java.util.Scanner;

public class MatrixTransformation {
    private static final int DIMENTION = 4;

    public static void main(String[] args) {
	    int matrix[][] = new int [DIMENTION][DIMENTION];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < DIMENTION; i++) {
            for (int j = 0; j < DIMENTION; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < DIMENTION; i++) {
            for (int j = 0; j < DIMENTION; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < DIMENTION ; i++) {
            for (int j = 0; j < DIMENTION; j++) {
                if (i < j) matrix[i][j] = matrix[i][j] * 2;
                if (i > j) matrix[i][j] = matrix[i][j] / 2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
