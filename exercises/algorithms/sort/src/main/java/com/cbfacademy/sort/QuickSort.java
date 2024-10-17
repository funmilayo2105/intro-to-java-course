package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    @Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        // Ensure the starting index is less than the ending index
        if (startIndex < endIndex) {
            // Partition the array around a pivot element and get its position
            int pivotIndex = partition(arr, startIndex, endIndex);
            
            // Recursively sort the partitions on either side of the pivot
            sort(arr, startIndex, pivotIndex - 1);  // Left of the pivot
            sort(arr, pivotIndex + 1, endIndex);    // Right of the pivot
        }
    }

    // Partition method to rearrange elements around the pivot
    private int partition(int[] arr, int startIndex, int endIndex) {
        // Choose the rightmost element as the pivot
        int pivot = arr[endIndex];
        
        // Track the position of the element representing the boundary of the lower partition
        int boundaryIndex = startIndex - 1;
        
        // Iterate through the array and partition elements based on pivot
        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            // If the current element is less than or equal to the pivot
            if (arr[currentIndex] <= pivot) {
                boundaryIndex++;
                swap(arr, boundaryIndex, currentIndex);
            }
        }
        
        // Move the pivot element to its correct position
        swap(arr, boundaryIndex + 1, endIndex);
        
        // Return the position of the pivot
        return boundaryIndex + 1;
    }

    // Swap method to exchange two elements in the array
    private void swap(int[] arr, int leftIndex, int rightIndex) {
        // Store the value of the left-hand element
        int temp = arr[leftIndex];
        
        // Assign the value of the right-hand element to the left-hand element
        arr[leftIndex] = arr[rightIndex];
        
        // Assign the original value of the left-hand element to the right-hand element
        arr[rightIndex] = temp;
    }
}
