package sort.heapsort;


// insert all the element of unsorted array into heap
// should be a complete binary tree / almost binary tree (no any gap)
// the dta stored in each node is greater than and equals or smaller than and equals to the data item stored in its children.
// parent should be greater then child
// Then again put heap elements into an array
// Then remove the maximum element and swap it with the last index position element
// Then again heapify (convert a array to binary tree into a heap data structure)
// Repeat the step till heap remain with the single element
// heapify() take time complexity O(n), and insert to heap and sort take time complexity O(nlogn)
public class HeapSort {

    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        HeapSort hps = new HeapSort();
        hps.sort(numberArray);
    }

    public static void printArray(int[] numberArray){
        for(int i =0; i <numberArray.length; i++){
            System.out.print(numberArray[i] + " | ");
        }
    }

    private void sort(int[] arr) {
        int length = arr.length;
        for(int i = (length/2)-1; i >= 0; i--){
            heapify(arr, length, i);
            System.out.println("\nBuild Heap Array:---");
            printArray(arr);
        }

        for(int i = length - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            System.out.println("\nDelete root/ Swap root with last element and build again Heap:---");
            printArray(arr);
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int len, int parentIndex) {
        int largestIndex = parentIndex;
        int left = 2 * parentIndex + 1;
        int right = 2 * parentIndex + 2;

        if(left < len && arr[left] > arr[largestIndex]){
            largestIndex = left;
        }

        if(right < len && arr[right] > arr[largestIndex]){
            largestIndex = right;
        }

        if(largestIndex != parentIndex){
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

            heapify(arr, len, largestIndex);
        }
    }
}
