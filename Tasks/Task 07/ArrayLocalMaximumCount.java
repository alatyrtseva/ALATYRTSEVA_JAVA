public class ArrayLocalMaximumCount {
    public static int localmaximimcount(int array[]){
        int localMaximumCount = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] > array [i - 1]) & (array[i] > array [i + 1])) {
                localMaximumCount = localMaximumCount + 1;
            }
        }
        return localMaximumCount;
    }

    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        System.out.println("Count of local maximums: " + localmaximimcount(a));
    }
}