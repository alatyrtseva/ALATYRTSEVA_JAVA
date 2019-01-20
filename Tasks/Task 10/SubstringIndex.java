import java.util.Scanner;

class SubstringIndex {
	public static int getSubstringStart(char[] search, char[] sought) {		
        int soughtIndex = -1;
        int i = 0;
        int j = 0;
        for (i = 0; (i < search.length) & (soughtIndex == -1); i++) {
        	soughtIndex = i;
        	for (j = 0; (j < sought.length) & (soughtIndex > -1); j++) {     		
        		if (i + j >= search.length) {
        			soughtIndex = -1;
        		}
        		else {
        			if (search[i+j] != sought[j]) {
        				soughtIndex = -1;
        			}
        		}
        	}
        }
        if (soughtIndex != -1) {
        	soughtIndex = soughtIndex + 1;
        }
        return soughtIndex;
	}
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
        char searchString[] = scanner.nextLine().toCharArray();
        char soughtString[] = scanner.nextLine().toCharArray();
        System.out.println("Start position:" + getSubstringStart(searchString,soughtString));
	}
}