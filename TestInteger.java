import java.util.Arrays;

// Ryan Sajulga and Nik Bailey

public class TestInteger implements Comparable<TestInteger> {
    private int value; //Variable for setting the value of a TestInteger
    static public int counter; //Counter for # of comparisons
    
    //Constructor for TestInteger object
    public TestInteger(int x) {
        value = x;
    }

    //Setter method to reset the counter
    public static void resetCounter() {
        counter = 0;
    }

    //Getter method to get current value of the counter
    public static int getCounter() {
        return counter;
    }

    //compareTo method that increments the counter
    public int compareTo(TestInteger other) {
        counter++;
        return this.compareTo(other);
    }

    //Creates an ordered array of length size
    public static TestInteger[] orderedArray(int size) {
        TestInteger[] arr = new TestInteger[size];
        for(int i = 0; i < size; i++) {
            arr[i] = new TestInteger(i + 1);
        }
        return arr;
    }

    //Creates a random array of length size
    public static TestInteger[] randomArray(int size) {
        TestInteger[] arr = new TestInteger[size];
        for(int i = 0; i < size; i++) {
            arr[i] = new TestInteger((int) Math.floor(Math.random() * (1000000 -1) + 1));
        }
        return arr;
    }

    //Test method to determine if an array is in order
    public static boolean isSorted(TestInteger[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(arr[i - 1]) <= 0) {
                return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        resetCounter(); //Making sure the counter starts at 0
        TestInteger[] arr1 = randomArray(10000);
        TestInteger[] arr2 = randomArray(10000);

        // First testing scenario
        Arrays.sort(arr1); //Using timsort method
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();
        Quicksort.quickSort(arr2, 0, arr2.length);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();
        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\n arr2: " + isSorted(arr2));

        // Second testing scenario
        arr1 = orderedArray(10000);
        arr2 = orderedArray(10000);
        Arrays.sort(arr1);
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();
        Quicksort.quickSort(arr2, 0, arr2.length);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();
        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\n arr2: " + isSorted(arr2));

        // Third testing scenario
    }
}