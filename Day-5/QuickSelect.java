import java.util.Random;

public class QuickSelect {
    
    public static int findKthLargest(int[] arr, int k){
        int selected = arr.length - k;  // Convert k-th largest to k-th smallest index
        return quickSelect(arr, 0, arr.length - 1, selected);
    }

    public static int quickSelect(int[] arr, int start, int end, int k){
        if (start == end)
            return arr[start];

        int piPoint = getPivotal(arr, start, end);
        
        if (piPoint == k)
            return arr[piPoint];
        else if (piPoint < k)
            return quickSelect(arr, piPoint + 1, end, k);
        else
            return quickSelect(arr, start, piPoint - 1, k);
    }

    public static int getPivotal(int[] arr, int start, int end){
        // Random pivot selection prevents the worst case of O(n^2) to O(n)
        int pivotIndex = new Random().nextInt(end - start + 1) + start;
        swap(arr, pivotIndex, end);  // Move pivot to the end

        int pivotData = arr[end];
        int init = start;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivotData) {
                swap(arr, j, init);
                init++;
            }
        }

        swap(arr, end, init);
        return init;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println("Kth Largest Element: " + findKthLargest(nums, k));
    }
}
