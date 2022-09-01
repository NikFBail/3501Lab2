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
        int n = arr1.length;
      
        quickSort(arr1, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr1, n);
    }
}
