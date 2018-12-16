import java.util.Scanner;	
class PrintBinary {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
        int decimalnumber = in.nextInt();
        if (decimalnumber<256) {
			String binarynumber = Integer.toString(decimalnumber % 2);
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			decimalnumber = decimalnumber / 2;
			binarynumber = decimalnumber % 2 + binarynumber;
			System.out.println(binarynumber);
		}
		else
		{
			System.out.println("Number is greater than 255");
		}
	}
}