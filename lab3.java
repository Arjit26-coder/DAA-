// insertion sort implementation in Java
import java.util.Arrays;

public class lab3 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int c = i;
            while (c > 0 && arr[c] < arr[c - 1]) {
                // Swap arr[c] and arr[c - 1]
                int temp = arr[c];
                arr[c] = arr[c - 1];
                arr[c - 1] = temp;
                c--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}

