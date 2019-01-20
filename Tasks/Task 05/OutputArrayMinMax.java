public class OutputArrayMinMax {

	public static int minimum (int array[]) {
		int arrayMin = array[0];

        for (int i = 0; i < array.length; i++) {
        	if (array[i] < arrayMin) {
        		arrayMin = array[i];
        	}
        }

        return arrayMin;
	}

	public static int maximum (int array[]) {
		int arrayMax = array[0];

        for (int i = 0; i < array.length; i++) {
        	if (array[i] > arrayMax) {
        		arrayMax = array[i];
        	}
        }

        return arrayMax;
	}

    public static void main(String[] args) {
        int a[] = {5, 9, 9, 45, 14, 8, 32, 85, 102, 46};

        System.out.println("Maximum of array: "+minimum(a));
        System.out.println("Minimum of array: "+maximum(a));
    }
}