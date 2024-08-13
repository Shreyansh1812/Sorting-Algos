public class Merge_Sort {

    public static void divide(int[] arr, int s, int e) {
        if (s >= e) { // Condition to Find Whether there is Singular array or not
            return;
        }

        int mid = s + (e - s) / 2;// Because if we use the traditional option sometimes the resultant will be out of integer holding capacity

        // Dividing the Array
        divide(arr, s, mid);
        divide(arr, mid + 1, e);

        // Merging the Divided Arrays
        conquer(arr, s, e, mid);
    }

    private static void conquer(int[] arr, int start, int end, int mid) { // Creation of this means we need now to merge sub-arrays
        int[] merge = new int[end - start + 1];//+1 Because the indexation starts from 0 so in order to get the correct size We Do this 
        int idx1 = start;  // Initial index of first subarray
        int idx2 = mid + 1; // Initial index of second subarray
        int x = 0; // Initial index of merged subarray

        // Merge the two subarrays into the 'merge' array
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
            
        }
       // If Youu Remove this Block ,the Other ELements Won't be Copied only the one Which is Smaller Will Get it's Place.
        // Copy remaining elements of the left subarray, if any
        while (idx1 <= mid) {
            merge[x] = arr[idx1];
            idx1++;
            x++;
        }

        // Copy remaining elements of the right subarray, if any
        while (idx2 <= end) {
            merge[x] = arr[idx2];
            idx2++;
            x++;
        }

        // Copy the merged elements back to the original array
        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 7};
        int n = arr.length;

        // Calling the divide function to start merge sort
        divide(arr, 0, n - 1);

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//Time Complexity: O(nlogn);
