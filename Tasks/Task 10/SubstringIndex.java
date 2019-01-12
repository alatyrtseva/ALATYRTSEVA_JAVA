import java.util.Scanner;

class SubstringIndex {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
        char searchString[] = scanner.nextLine().toCharArray();
        char soughtString[] = scanner.nextLine().toCharArray();
        int soughtIndex = -1;
        int i = 0;
        int j = 0;
        for (i = 0; (i < searchString.length) & (soughtIndex == -1); i++) {
        	soughtIndex = i;
        	for (j = 0; (j < soughtString.length) & (soughtIndex > -1); j++) {     		
        		if (i + j >= searchString.length) {
        			soughtIndex = -1;
        		}
        		else {
        			if (searchString[i+j] != soughtString[j]) {
        				soughtIndex = -1;
        			}
        		}
        	}
        }
        if (soughtIndex != -1) {
        	soughtIndex = soughtIndex + 1;
        }
        System.out.println("Start position:" + soughtIndex);
	}
}