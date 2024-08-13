import java.util.*;

public class Insertion_sort {
    static void sort(int[] arr) {
        int n = arr.length;

       // We are Starting the Element Searching from Index-01. We are Considering 1st Element as to be Sorted Trivially
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted in the sorted portion
            int j = i - 1;// We are taking an another Element to be at the beginning Index

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // If Found Element during Iteration the We then Take the Smaller element to the left side 
                j = j - 1; // We then reduce the j by one and Repeat the Process
            }
            arr[j + 1] = key; // Insert the key at the correct position

            // Display the array after each pass
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 4, 5, 2, 1};
        sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
