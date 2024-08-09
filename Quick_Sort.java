import java.util.*;

public class Quick_Sort {

    // Function to partition the array into two parts
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];  // Pivot is chosen as the last element
        int i = s - 1; // Index to keep track of elements smaller than pivot

        // Loop through the array to partition it
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) { // If the current element is smaller than the pivot
                i++; // Increment the index for smaller element
                // Swap the elements at i and j to move the smaller element to the correct position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position in the sorted array
        i++;
        int temp = arr[i];
        arr[i] = arr[e]; // arr[e] is the pivot, so swap it with the element at i
        arr[e] = temp;

        return i; // Return the index of the pivot
    }

    // Recursive function to perform Quick Sort
    public static void Sort(int[] arr, int s, int e) {
        if (s < e) { // Base condition to end recursion
            // Partition the array and get the pivot index
            int pidx = partition(arr, s, e);
            // Recursively sort elements before and after partition
            Sort(arr, s, pidx - 1); // Sort the left sub-array
            Sort(arr, pidx + 1, e); // Sort the right sub-array
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 50}; // Initialize the array to be sorted
        int n = arr.length; // Get the length of the array

        // Call the Sort function to perform Quick Sort
        Sort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element in the array
        }
    }
}
