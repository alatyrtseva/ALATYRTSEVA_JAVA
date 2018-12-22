public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        int b[] = new int[a.length];
        
        for (int i = a.length - 1; i >=0; i--) {
        	b[a.length - 1 - i] = a [i];
        }        

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}