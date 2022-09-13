import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// Ryan Sajulga and Nik Bailey

public class TestInteger implements Comparable<TestInteger> {
    private int value; //Variable for setting the value of a TestInteger
    static public int counter; //Counter for # of comparisons
    
    //Constructor for TestInteger object
    public TestInteger(int x) {
        value = x;
    }
    
    public int getTestInteger(TestInteger x) {
        return value;
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
    //returns negative if curr < other
    //returns positive if other < curr
    //returns 0 if curr = other
    public int compareTo(TestInteger other) {
        counter++;
        int curr = getTestInteger(this);
        int oth = getTestInteger(other);
        return curr - oth;
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
            if(arr[i].compareTo(arr[i - 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /* Create method that initializes an array
     * The array is made up of 10000 elements
     * but in 10 sorted sequences of 1000 elements
     */
    public static TestInteger[] sortedSequence(int size) {
        TestInteger[] arr = new TestInteger[size];
        int num;
        int start;
        for(int i = 0; i < size / 1000; i++) {
            num = i * 1000;
            start = (int) Math.floor(Math.random() * (1000000 -1) + 1);
            for(int j = 0; j < 1000; j++) {
                arr[num] = new TestInteger(start);
                start++;
                num++;
            }
        }
        return arr;
    }

    /* Create method that initializes an array
     * The array is made up of 10000 elements
     * but in 10 reverse sorted sequences of 1000 elements
     */
    public static TestInteger[] reverseSequence(int size) {
        TestInteger[] arr = new TestInteger[size];
        int num;
        int start;
        for(int i = 0; i < size / 1000; i++) {
            num = i * 1000;
            start = (int) Math.floor(Math.random() * (1000000 -1) + 1);
            for(int j = 0; j < 1000; j++) {
                arr[num] = new TestInteger(start);
                start--;
                num++;
            }
        }
        return arr;
    }
    
     // Driver Code
    public static void main(String[] args) {
        resetCounter(); //Making sure the counter starts at 0
        TestInteger[] arr1 = randomArray(10000);
        TestInteger[] arr2 = randomArray(10000);
        TestInteger[] arr3 = randomArray(10000);
        TestInteger[] arr4 = randomArray(10000);

        // First testing scenario
        Arrays.sort(arr1); //Using timsort method
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();

        Quicksort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();

        RandomQuicksort.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the random quicksort method");
        resetCounter();

        MedianQuicksort.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the median quicksort method");
        resetCounter();

        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\narr2: " + isSorted(arr2) + "\narr3: " + isSorted(arr3) + "\narr4: " + isSorted(arr4));
        // Test 1- 9999 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 2- 9999 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 3- 9999 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 4- 9999 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 5- 9999 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort 
        
        // Second testing scenario
        arr1 = orderedArray(10000);
        arr2 = orderedArray(10000);
        arr3 = orderedArray(10000);
        arr4 = orderedArray(10000);

        Arrays.sort(arr1);
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();

        Quicksort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();

        RandomQuicksort.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the random quicksort method");
        resetCounter();

        MedianQuicksort.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the median quicksort method");
        resetCounter();

        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\narr2: " + isSorted(arr2) + "\narr3: " + isSorted(arr3) + "\narr4: " + isSorted(arr4));
        // Test 1- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 2- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 3- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 4- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 5- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort

        // Third testing scenario
        arr1 = sortedSequence(10000);
        arr2 = sortedSequence(10000);
        arr3 = sortedSequence(10000);
        arr4 = sortedSequence(10000);

        Arrays.sort(arr1);
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();

        Quicksort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();

        RandomQuicksort.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the random quicksort method");
        resetCounter();

        MedianQuicksort.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the median quicksort method");
        resetCounter();

        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\narr2: " + isSorted(arr2) + "\narr3: " + isSorted(arr3) + "\narr4: " + isSorted(arr4));
        // Test 1- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 2- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 3- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 4- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 5- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort


        // Fourth testing scenario
        arr1 = reverseSequence(10000);
        arr2 = reverseSequence(10000);
        arr3 = reverseSequence(10000);
        arr4 = reverseSequence(10000);

        Arrays.sort(arr1); //Using timsort method
        System.out.println("There were " + getCounter() + " comparisons using the timsort method");
        resetCounter();

        Quicksort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the quicksort method");
        resetCounter();

        RandomQuicksort.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the random quicksort method");
        resetCounter();

        MedianQuicksort.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("There were " + getCounter() + " comparisons using the median quicksort method");
        resetCounter();

        System.out.println("The arrays should be sorted");
        System.out.println("arr1: " + isSorted(arr1) + "\narr2: " + isSorted(arr2) + "\narr3: " + isSorted(arr3) + "\narr4: " + isSorted(arr4));
        // Test 1- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 2- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 3- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 4- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        // Test 5- 49995 timsort, 49995000 quicksort, 49995000 random quicksort, 50054994 median quicksort
        
    }
 }
