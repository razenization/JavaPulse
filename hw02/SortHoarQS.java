package hw02;

public class SortHoarQS {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void qs(int[] arrayToSort) {
        int startIndex = 0;
        int endIndex = arrayToSort.length - 1;
        doSort(arrayToSort, startIndex, endIndex);
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array,cur+1, end);
    }

    public static void main(String[] args) {
        int[] array = new int[]{42, 64, 24, 23, 51, 104, 55};
        qs(array);
        printArray(array);
    }
}