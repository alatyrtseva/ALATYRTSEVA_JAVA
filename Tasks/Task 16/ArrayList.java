import java.util.Scanner;

public class ArrayList {

    int array[];

    public ArrayList(int length) {
        this.array = new int[length];
    };

    void add(int element) {
        int i;

        for (i = 0; (i < this.array.length && this.array[i] != 0); i++) {

        }
        ;
        if (i < this.array.length - 1) {
            this.array[i] = element;
            this.array[i + 1] = 0;
        }
    }

    ;
    void addToBegin(int element) {
        int i;
        int lastIndex = this.getCount();
        for (i = lastIndex; i >= 1; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[0] = element;
    }

    ;

    int get(int index) {
        return this.array[index];
    }

    ;

    void insert(int element, int index) {
        int i;
        for (i = this.array.length - 1; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = element;
    }

    ;

    void reverse() {
        int[] bufferarray = new int[this.getCount()];
        int i;
        for (i = 0; i < this.array.length && this.array[i] != 0; i++) {
            bufferarray[i] = this.array[i];
        }
        ;
        i = i - 1;
        for (int j = 0; j <= i; j++) {
            this.array[j] = bufferarray[i - j];
        }
    }

    ;

    int getCount() {
        int i;
        boolean isEnd = false;
        for (i = 0; (i < this.array.length && !(isEnd)); i++) {
            isEnd = this.array[i] == 0;
        }
        ;
        return i - 1;
    };

    int getLastIndex () {
        return getCount() - 1;
    }

    void sort() {
        int iminimum;
        int minimum;

        for (int i = 0; i < this.getCount(); i++) {
            iminimum = i;
            for (int j = i; j < this.getCount(); j++) {
                if (array[iminimum] > this.array[j]) {
                    iminimum = j;
                }
            }
            if (iminimum > i) {
                minimum = this.array[iminimum];
                this.array[iminimum] = this.array[i];
                this.array[i] = minimum;
            }
        }
    }

    ;

    boolean contains(int element) {
        boolean iscontains = false;
        for (int i = 0; (i < this.array.length && this.array[i] != 0 && !(iscontains)); i++)
            iscontains = this.array[i] == element;
        ;
        return iscontains;
    }

    ;

    int indexOf(int element) {
        int i;
        int j = -1;
        for (i = 0; (i < this.array.length && this.array[i] != 0 && j == -1); i++) {
            if (this.array[i] == element) j = i;
        }
        ;
        return j;
    };

    public static void main (String[] args) {
        ArrayList arraylist = new ArrayList(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input elements (end of array - '0')");
        int element = scanner.nextInt();
        while (element != 0) {
            arraylist.add(element);
            element = scanner.nextInt();
        }
        ;
        System.out.println("Result:");
        for (int i = 0; arraylist.get(i) != 0; i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println("Input element to add to begin");
        element = scanner.nextInt();
        arraylist.addToBegin(element);

        System.out.println("Result:");
        for (int i = 0; arraylist.get(i) != 0; i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("Input index to get element by index (index 0 - " + arraylist.getLastIndex() + ")");
        System.out.println(arraylist.get(scanner.nextInt()));

        System.out.println("Input element to insert:");
        element = scanner.nextInt();
        System.out.println("Input position index to insert element (index 0 - " + arraylist.getLastIndex() + ")");
        int index = scanner.nextInt();
        arraylist.insert(element, index);

        System.out.println("Result:");
        for (int i = 0; arraylist.get(i) != 0; i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("Reverted:");
        arraylist.reverse();
        for (int i = 0; arraylist.get(i) != 0; i++) {
            System.out.println(arraylist.get(i));
        };

        System.out.println("Count of elements = " + arraylist.getCount());

        System.out.println("Sorted:");
        arraylist.sort();
        for (int i = 0; arraylist.get(i) != 0; i++) {
            System.out.println(arraylist.get(i));
        };

        System.out.println("Input element to search");
        element = scanner.nextInt();
        while (!(arraylist.contains(element))) {
            System.out.println("Input another");
            element = scanner.nextInt();
        }
        System.out.println("Index of " + element + " - " + arraylist.indexOf(element));
    }
}
