package sort.quicksort;

public class QuickSortEndReverse {

    void swap(int[] arr, int source, int dest){
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }

    int partition(int[] arr, int low, int high){
        int pivotElement = arr[high];
        int pIndex = low;
        for(int i = low; i < high; i++){
            if(arr[i] > pivotElement){
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
        new QuickSortEndReverse().quickSort(numberArray, 0, numberArray.length -1);
        for(int x = 0; x < numberArray.length; x++) {
            System.out.print(numberArray[x] + " | ");
        }

    }
}
