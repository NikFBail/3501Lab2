public class TestInteger implement Comparable<Test Integer> {
    private int value;
    static public int counter;

    public int compareTo(TestInteger other) {
        counter++;
    }

    

    // Driver Code
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            arr2[i] = (int) Math.random();
        }
        int n = arr.length;
      
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
