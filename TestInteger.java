import java.sql.Array;

public class TestInteger implements Comparable<TestInteger> {
    private int value;
    static public int counter;

    public TestInteger(int x) {
        value = x;
    }

    public int compareTo(TestInteger other) {
        counter++;
    }

    public Array orderedArray(int size) {
        TestInteger[] arr = new TestInteger[size];
        for(int i = 0; i < size; i++) {
            arr[i] = new TestInteger(i + 1);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        for(int i=0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            arr2[i] = (int) Math.floor(Math.random() * (1000000 -1) + 1);
        }

        Quicksort.quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array: ");
        Quicksort.printArray(arr1, arr1.length);

        Quicksort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array: ");
        Quicksort.printArray(arr2, arr2.length);
    }
}