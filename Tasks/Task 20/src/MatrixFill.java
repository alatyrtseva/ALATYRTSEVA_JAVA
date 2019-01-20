public class MatrixFill {
    private static final int DIM = 7;
    public static void main(String[] args) {
	    int matrix[][] = new int[DIM][DIM];
	    int element=1;

	    int i = 0;
	    int j = 0;

	    i = 0;
	    for (j = 0; j < DIM; j++) {
	        matrix[i][j] = element;
	        element += 1;
        }
        j = DIM - 1;
	    for (i = 1; i < DIM; i++) {
	        matrix[i][j] = element;
            element += 1;
        }
        i = DIM - 1;
	    for (j = DIM - 2; j >= 0; j--) {
	        matrix[i][j] = element;
            element += 1;
        }
        j = 0;
	    for (i = DIM - 2; i >= 1; i--){
	        matrix[i][j] = element;
            element += 1;
        }

        i = 0;
	    j = 0;
        while (element <= DIM * DIM) {
            i++;
            j++;
            while (matrix[i][j] == 0) {
                matrix[i][j] = element;
                j++;
                element++;
            }
            i++;
            j--;
            while (matrix[i][j] == 0) {
                matrix[i][j] = element;
                i++;
                element++;
            }
            i--;
            j--;
            while (matrix[i][j] == 0){
                matrix[i][j] = element;
                j--;
                element++;
            }
            i--;
            j++;
            while (matrix[i][j] == 0){
                matrix[i][j] = element;
                i--;
                element++;
            }
        }

        for (i = 0; i < DIM; i++) {
	        for (j = 0; j < DIM; j++) {
	            if (matrix[i][j]<10) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
