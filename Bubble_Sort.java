import java.util.*;

public class Bubble_Sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {  // Start j from 1 and go till arr.length - i
                if (arr[j] < arr[j - 1]) { // Compare arr[j] with arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
