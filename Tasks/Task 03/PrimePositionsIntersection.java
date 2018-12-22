import java.util.Scanner;

class PrimePositionsIntersection {
	public static void main(String[] args) {
		Scanner inputSequence = new Scanner(System.in);
		int sequenceItem = inputSequence.nextInt();
		int digitSum = 0;
		int intersection = 1;
		int numberPosition = 1;
		int factor = 1;
		while (sequenceItem != -1) {
			while (sequenceItem != 0) {
				digitSum = digitSum + sequenceItem%10;
				sequenceItem = sequenceItem/10;
			}
			if (digitSum == 1) {
				factor = 1;
			}
			else {
				factor = numberPosition;
			}
			for (int divider = 2; divider * divider <= digitSum; divider++) {
            if (digitSum % divider == 0) {
         			factor = 1;
     	        }
 	        }
			digitSum = 0;
 	        intersection = intersection * factor;
 	        sequenceItem = inputSequence.nextInt();
 	        numberPosition = numberPosition + 1;
		}

		System.out.println("Intersetion: " + intersection);
	}
}