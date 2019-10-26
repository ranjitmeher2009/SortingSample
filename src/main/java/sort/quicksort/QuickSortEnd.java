package sort.quicksort;

// select any element from list and treat as pivot
// arrange all smallest then pivot element on left side and bigger element on right side of pivot element
// here last element is pivot element
// do this sort recursively
// time complexity : best case: O(n lon n) , worst case: O(n^2)
public class QuickSortEnd {

    void swap(int[] arr, int source, int dest){
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }

    int partition(int[] arr, int low, int high){
        int pivotElement = arr[high];
        int pIndex = low;
        for(int i = low; i < high; i++){
            if(arr[i] <= pivotElement){
                swap(arr, i, pIndex);
                pIndex = pIndex +1;
            }
        }
        swap(arr, pIndex, high);
        return pIndex;
    }

    void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotalIndex = partition(arr, low, high);
            quickSort(arr,low,pivotalIndex-1);
            quickSort(arr,pivotalIndex,high);
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        new QuickSortEnd().quickSort(numberArray, 0, numberArray.length -1);
        for(int x = 0; x < numberArray.length; x++) {
            System.out.print(numberArray[x] + " | ");
        }

    }
}
