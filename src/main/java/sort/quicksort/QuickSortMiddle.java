package sort.quicksort;

// select any element from list and treat as pivot // Algo - divide and conquer
// arrange all smallest then pivot element on left side and bigger element on right side of pivot element By swapping
// here middle/ first element is pivot element
// do this sort recursively
// time complexity : best case: O(n lon n) , worst case: O(n^2)
public class QuickSortMiddle {

    int partition(int[] arr, int low, int high){
        int pi = (low + high) /2; // pivot is middle
        //int pi = low; // pivot is first element
        while (low <= high){
            while (arr[low] < arr[pi]){
                low++;
            }

            while (arr[high] > arr[pi]){
                high--;
            }

            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSort(int[] arr, int low, int high){
        int pivotalIndex = partition(arr, low, high);
        if(low < pivotalIndex-1){
            quickSort(arr,low,pivotalIndex-1);
        }
        if(pivotalIndex < high){
            quickSort(arr,pivotalIndex,high);
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        new QuickSortMiddle().quickSort(numberArray, 0, numberArray.length -1);
        for(int x = 0; x < numberArray.length; x++) {
            System.out.print(numberArray[x] + " | ");
        }

    }
}
