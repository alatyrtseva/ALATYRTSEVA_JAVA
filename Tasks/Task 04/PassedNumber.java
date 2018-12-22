import java.util.Scanner;

class PassedNumber {
	public static void main(String[] args) {
		Scanner inputSequence = new Scanner(System.in);
		int sequenceItem = 0;
		int sequenceSum = 0;
		int numbersLimit = 13;
		for (int increment = 1; increment < numbersLimit - 1; increment++) {
			sequenceItem = inputSequence.nextInt();
			sequenceSum = sequenceSum + sequenceItem;
		}
		int sampleSum = 0;
		for (int increment = 1; increment < numbersLimit; increment++) {
			sampleSum = sampleSum + increment;
		}
		int passedNumber = sampleSum - sequenceSum;
		System.out.println("Passed number: "+passedNumber);
	}
}