// Selection Sort using predefined input
import java.util.Arrays;
// import java.util.Scanner;
public class lab1 {
    void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {34, 7, 23, 32, 5, 62};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of elements: ");
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // System.out.println("Enter elements:");
        // for (int i = 0; i < n; i++) {
        //     a[i] = sc.nextInt();
        // }
    
        System.out.println("Before Sorting: " + Arrays.toString(a));
        lab1 obj = new lab1();
        obj.selectionSort(a);
        System.out.println("After Sorting: " + Arrays.toString(a));
        //sc.close();
    }
}
