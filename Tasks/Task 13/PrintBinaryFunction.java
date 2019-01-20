import java.util.Scanner;	
class PrintBinaryFunction {
	public static String getbinary(int number) {
		String result;
		if (number<256) {
			String binarynumber = Integer.toString(number % 2);
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			number = number / 2;
			binarynumber = number % 2 + binarynumber;
			result = binarynumber;
		}
		else
		{
			result = "Number is greater than 255";
		}
		return result;
	}

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
        int decimalnumber = in.nextInt();
        System.out.println(getbinary(decimalnumber));
	}
}