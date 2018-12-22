public class ArraySorting {
    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        int iminimum;
        int minimum;

        for (int i = 0; i < a.length ; i++) {
            iminimum = i;
            for (int j = i; j < a.length ; j++) {
                if (a[iminimum] > a[j]) {
                    iminimum = j;
                }
            }
            if (iminimum > i) {
                minimum = a[iminimum];
                a[iminimum] = a[i];
                a[i] = minimum;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}