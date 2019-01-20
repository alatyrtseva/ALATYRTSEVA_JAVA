public class MatrixWorker {

    public static final int DIMENTION = 4;

    public int[][] matrixSum (int a[][], int b[][]) {
        int[][] c;
        boolean checkDimentions = true;
        if (a.length == b.length)  {
            for (int i = 0; i < a.length && checkDimentions; i++) {
                checkDimentions = a[i].length == b[i].length;
            }
        }
        else checkDimentions = false;

        if (checkDimentions) {
            c = new int[a.length ][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        else
            {
                c = new int[1][1];
                c[0][0] = -1;
            }
        return c;
    }

    public int[][] matrixMultiplication (int a[][], int b[][]) {
        int[][] c;
        boolean checkDimentions = true;
        if (a.length == b.length)  {
            for (int i = 0; i < a.length && checkDimentions; i++) {
                checkDimentions = a[i].length == b[i].length;
            }
        }
        else {
            checkDimentions = false;
        }

        if (checkDimentions) {
            c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < a[i].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        else
            {
                c = new int[1][1];
                c[0][0] = -1;
            }
        return c;
        }

        public void matrixPrint (int a[][]) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
}
