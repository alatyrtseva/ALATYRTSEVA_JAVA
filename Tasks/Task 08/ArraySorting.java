public class ArraySorting {
    public static int[] sorting(int array[]) {
        int iminimum;
        int minimum;

        for (int i = 0; i < array.length ; i++) {
            iminimum = i;
            for (int j = i; j < array.length ; j++) {
                if (array[iminimum] > array[j]) {
                    iminimum = j;
                }
            }
            if (iminimum > i) {
                minimum = array[iminimum];
                array[iminimum] = array[i];
                array[i] = minimum;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        a = sorting(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}