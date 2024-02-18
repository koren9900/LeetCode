package org.problems.easy;

class TwoSum {
    int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int[] indexes = new int[N];
        for(int i=0; i < N; i++)
            indexes[i] = i;

            // o(NLogN)
        quickSort(indexes, nums, 0, N - 1);
        int[] ansIndexes = new int[]{0,1};
        int max1 = N-1;
        while(nums[ansIndexes[0]]+nums[ansIndexes[1]]!=target){
            if(nums[ansIndexes[0]]+nums[ansIndexes[1]] < target){
                if(ansIndexes[1] < max1)
                    ansIndexes[1]++;
                else
                    ansIndexes[0]++;
            }
            else{
                max1 = ansIndexes[1] - 1;
                ansIndexes[1]--;
           }
        }
        ansIndexes[0] = indexes[ansIndexes[0]];
        ansIndexes[1] = indexes[ansIndexes[1]];
        return(ansIndexes);

    }
    // A utility function to swap two elements
    void swap(int[] indexes, int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        temp = indexes[i];
        indexes[i] = indexes[j];
        indexes[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    int partition(int[] indexes, int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(indexes, arr, i, j);
            }
        }
        swap(indexes, arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    void quickSort(int[] indexes, int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(indexes, arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(indexes, arr, low, pi - 1);
            quickSort(indexes, arr, pi + 1, high);
        }
    }


}
