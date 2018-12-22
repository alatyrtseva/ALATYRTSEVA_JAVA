public class ArrayLocalMaximumCount {
    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        int localMaximumCount = 0;

        for (int i = 1; i < a.length - 1; i++) {
            if ((a[i] > a [i - 1]) & (a[i] > a [i + 1])) {
                localMaximumCount = localMaximumCount + 1;
            }
        }

        System.out.println("Count of local maximums: " + localMaximumCount);
    }
}