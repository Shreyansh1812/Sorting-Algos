import java.util.*;

public class Selection_sort {
    static void sort(int[] arr) {
        int n = arr.length;
        // Basically in Selection Sort We Use the Minimum Find Technique
        

        for (int i = 0; i < n - 1; i++) {
            int min = i; // Assume the current index is the minimum
            // Assuming that The Element at the First Index is the minimmum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    //Suppose if an Element is foudn which is smaller than the minimum number then Update min index 
                    // It will iterate till the end of loop until it founds the smallest Number
                    // Note: Swap will only happen when the entire iteration of the loop is completed
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
             System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 4, 5, 2, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
