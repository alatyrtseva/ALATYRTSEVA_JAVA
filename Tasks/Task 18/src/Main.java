import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        MatrixWorker matrixWorker = new MatrixWorker();
        int aMatrix[][] = new int [matrixWorker.DIMENTION][matrixWorker.DIMENTION];
        int bMatrix[][] = new int [matrixWorker.DIMENTION][matrixWorker.DIMENTION];
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix[i].length; j++) {
                aMatrix[i][j] = randomNumber.nextInt(10) + 1;
                bMatrix[i][j] = randomNumber.nextInt(10) + 1;
            }
        }

        System.out.println("A: ");
        matrixWorker.matrixPrint(aMatrix);

        System.out.println("B: ");
        matrixWorker.matrixPrint(bMatrix);

        int cMatrix[][] = new int [matrixWorker.DIMENTION][matrixWorker.DIMENTION];
        cMatrix = matrixWorker.matrixSum(aMatrix,bMatrix);
        System.out.println("C: ");
        matrixWorker.matrixPrint(cMatrix);

        int dMatrix[][] = new int [matrixWorker.DIMENTION][matrixWorker.DIMENTION];
        dMatrix = matrixWorker.matrixMultiplication(aMatrix,bMatrix);
        System.out.println("D: ");
        matrixWorker.matrixPrint(dMatrix);
    }
}
