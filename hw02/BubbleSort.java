package hw02;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{42, 64, 24, 23, 51, 104, 55};
        int i, j;
        for (i = 0; i < array.length - 1; i++) {
            // Last i elements are already in place since on every iteration we just "push" the biggest element to the end
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int val:array) {
            System.out.println(val);
        }
    }
}
