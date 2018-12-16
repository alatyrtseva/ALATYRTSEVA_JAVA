import java.util.Scanner;
class Banknotes {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("sum: ");
		int sum = in.nextInt();
		int note5000 = sum / 5000;
		sum = sum - note5000 * 5000;
		int note2000 = sum / 2000;
		sum = sum - note2000 * 2000;
		int note1000 = sum / 1000;
		sum = sum - note1000 * 1000;
		int note500 = sum / 500;
		sum = sum - note500 * 500;
		int note200 = sum / 200;
		sum = sum - note200 * 200;
		int note100 = sum / 100;
		sum = sum - note100 * 100;
		int note50 = sum / 50;
		sum = sum - note50 * 50;		
		int note10 = sum / 10;
		sum = sum - note10 * 10;
		System.out.println("5000 - " + note5000);
		System.out.println("2000 - " + note2000);
		System.out.println("1000 - " + note1000);
		System.out.println("500 - " + note500);
		System.out.println("200 - " + note200);
		System.out.println("100 - " + note100);
		System.out.println("50 - " + note50);		
		System.out.println("10 - " + note10);
		System.out.println("rest - " + sum);
	}
}