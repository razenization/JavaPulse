package hw02;

public class ShakerSort {
    public static void main(String[] args) {
        int[] array = new int[]{42, 64, 24, 23, 51, 104, 55};
        boolean swapped = true;         // setting a flag to know when to end
        int start = 0;
        int end = array.length;

        while (swapped) {
            // reset the swapped flag
            swapped = false;

            // loop from bottom to top same as the bubble sort
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // if nothing moved, then array is sorted.
            if (!swapped)
                break;

            // otherwise, reset the swapped flag to use it in the downgoing iteration
            swapped = false;

            // move the end val back by one because the array[end] element is already in its position
            end = end - 1;

            // from top to bottom, doing the same (with bubble sort)
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // increase the starting point because we already moved the smallest element to its spot
            start = start + 1;
        }
        for (int val:array) {
            System.out.println(val);
        }
    }
}
