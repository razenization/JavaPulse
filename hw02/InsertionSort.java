package hw02;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 10, 11, 5, 2, 18};
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];               // current elements to swing back
            j = i - 1;                  // counter
            while (j >= 0 && arr[j] > key) {                // will swing key el towards the beginning of an array
                arr[j + 1] = arr[j];                        // until it reaches the one that is bigger than it
                j--;                                        // we can do this because the left side of an array
            }                                               // is already sorted
            arr[j + 1] = key;                               // next iteration
        }
        for (int val:arr) {
            System.out.println(val);
        }
    }
}
