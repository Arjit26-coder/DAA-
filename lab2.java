// Quick Sort using User Input
import java.util.Arrays;
//import java.util.Scanner;
public class lab2 {
    int partition(int a[], int lb, int ub) {
        int pivot = a[lb];
        int start = lb + 1;
        int end = ub;
        while (start <= end) {
            while (start <= ub && a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;
    }
    void quickSort(int a[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc - 1);
            quickSort(a, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of elements: ");
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // System.out.println("Enter elements:");
        // for (int i = 0; i < n; i++) {
        //     a[i] = sc.nextInt();
        // }
        int a[] = {34, 7, 23, 32, 5, 62};
        int n = a.length;
        System.out.println("Before Sorting: " + Arrays.toString(a));

        lab2 obj = new lab2();
        obj.quickSort(a, 0, n - 1);
        System.out.println("After Sorting: " + Arrays.toString(a));
        //sc.close();
    }
    
}
