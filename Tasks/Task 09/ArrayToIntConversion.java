import java.util.Scanner;

class ArrayToIntConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char inputNumber[] = scanner.nextLine().toCharArray();
		int outputNumber = 0;
		int position = 1;
		for (int i = inputNumber.length - 1; i >=0 ; i--) {
			outputNumber = outputNumber + ((int)inputNumber[i] - '0') * position;
			position=position*10;
		}
		System.out.println("Number: " + outputNumber);
	}
}