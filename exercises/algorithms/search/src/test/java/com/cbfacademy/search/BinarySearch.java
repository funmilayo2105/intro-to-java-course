package com.cbfacademy.search;

public class BinarySearch implements Search {

    @Override
    public int search(int[] sortedArray, int target) {
        // Initialize pointers for the low and high indices
        int low = 0;
        int high = sortedArray.length - 1;

        // Loop until the pointers meet
        while (low <= high) {
            // Find the middle index of the current range
            int mid = (low + high) / 2;

            // If the target value is at the mid-point element
            if (sortedArray[mid] == target) {
                // Return the index of the target
                return mid;
            }
            // If the target is greater than the mid-point element
            else if (target > sortedArray[mid]) {
                // Move the low pointer to the right of the mid-point
                low = mid + 1;
            }
            // If the target is smaller than the mid-point element
            else {
                // Move the high pointer to the left of the mid-point
                high = mid - 1;
            }
        }

        // If the target is not found, return -1 to indicate not found
        return -1;
    }
}
