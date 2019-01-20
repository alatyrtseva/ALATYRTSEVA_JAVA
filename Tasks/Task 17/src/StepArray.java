import java.util.Random;

public class StepArray {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int stepArray[][] = new int [randomNumber.nextInt(20) + 1][];
        for (int i = 0; i < stepArray.length; i++) {
            stepArray[i] = new int [randomNumber.nextInt(20) + 1];
            for (int j = 0; j < stepArray[i].length; j++) {
                stepArray[i][j] = randomNumber.nextInt(80) + 1;
            }
        }

        for (int i = 0; i < stepArray.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < stepArray[i].length; j++) {
                System.out.print(stepArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
