public class TestInteger implement comparable<Test Integer> {
    private int value;
    static public counter;

    public int compareTo(TestInteger other) {

    }

    

    // Driver Code
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
      
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
