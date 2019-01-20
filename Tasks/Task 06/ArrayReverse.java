public class ArrayReverse {

    public static int[] reverse(int array[]) {
        int reversed[] = new int[array.length];
        
        for (int i = array.length - 1; i >=0; i--) {
            reversed[array.length - 1 - i] = array [i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};
        int b[] = reverse(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}