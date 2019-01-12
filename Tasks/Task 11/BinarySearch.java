import java.util.Scanner;

class BinarySearch {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array length:");
        char inputNumber[] = scanner.nextLine().toCharArray();
		int arrayLength = 0;
		int position = 1;
		for (int i = inputNumber.length - 1; i >=0 ; i--) {
			arrayLength = arrayLength + ((int)inputNumber[i] - '0') * position;
			position=position*10;
		};
		int a[] = new int[arrayLength];
		System.out.println("Array:");
		for (int i = 0; i < arrayLength; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Sought number:");
		int soughtNumber = scanner.nextInt();
		int startPosition = 0;
		int finishPosition = a.length - 1;
		int soughtPosition = -1;
		int middlePosition;
		while ((soughtPosition == -1) & (startPosition < finishPosition - 1))	{
			middlePosition = startPosition + (finishPosition - startPosition)/2;
			if (a[middlePosition] == soughtNumber)	{
				soughtPosition = middlePosition;
			}
			else {
				if (a[middlePosition] > soughtNumber) {
					finishPosition = middlePosition;
				}
				else
				{
					startPosition = middlePosition;
				}
			}
		}
		System.out.println("Sought position " + soughtPosition);
	}
}