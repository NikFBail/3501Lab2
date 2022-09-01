public class TestInteger implements Comparable<TestInteger> {
    private int value;
    static public int counter;

    public int compareTo(TestInteger other) {
        counter++;
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
