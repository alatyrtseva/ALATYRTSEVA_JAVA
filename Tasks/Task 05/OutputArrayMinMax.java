public class OutputArrayMinMax {
    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        int arrayMin = a[0];
        int arrayMax = a[0];

        for (int i = 0; i < a.length; i++) {
        	if (a[i] < arrayMin) {
        		arrayMin = a[i];
        	}
        	if (a[i] > arrayMax) {
        		arrayMax = a[i];
        	}
        }

        System.out.println("Maximum of array: "+arrayMax);
        System.out.println("Minimum of array: "+arrayMin);
    }
}