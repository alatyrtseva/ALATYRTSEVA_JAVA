import java.util.Scanner;

class BinarySearch {
	public static int getlength() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array length:");
		int result = scanner.nextInt();
		return result;
	}
	public static int[] getarray(int length) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[length];
		System.out.println("Array:");
		for (int i = 0; i < length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}
	public static int getsoughtnumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sought number:");
		int result = scanner.nextInt();
		return result;
	}
	public static int position(int number, int array[]){		
		int startPosition = 0;
		int finishPosition = array.length - 1;
		int soughtPosition = -1;
		int middlePosition;
		while ((soughtPosition == -1) & (startPosition < finishPosition - 1))	{
			middlePosition = startPosition + (finishPosition - startPosition)/2;
			if (array[middlePosition] == number)	{
				soughtPosition = middlePosition;
			}
			else {
				if (array[middlePosition] > number) {
					finishPosition = middlePosition;
				}
				else
				{
					startPosition = middlePosition;
				}
			}
		}
		return soughtPosition;
	}
	public static void main (String args[]) {
		int arrayLength = getlength();
		int a[] = getarray(arrayLength);
		int soughtNumber = getsoughtnumber();
		System.out.println("Sought position " + position(soughtNumber,a));
	}
}