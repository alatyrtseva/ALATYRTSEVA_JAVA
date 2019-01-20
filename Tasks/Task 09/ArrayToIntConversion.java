import java.util.Scanner;

class ArrayToIntConversion {
	public static int arraytoint(char array[]){
		int outputNumber = 0;
		int position = 1;
		for (int i = array.length - 1; i >=0 ; i--) {
			outputNumber = outputNumber + ((int)array[i] - '0') * position;
			position=position*10;
		}
		return outputNumber;	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char inputNumber[] = scanner.nextLine().toCharArray();
		
		System.out.println("Number: " + arraytoint(inputNumber));
	}
}