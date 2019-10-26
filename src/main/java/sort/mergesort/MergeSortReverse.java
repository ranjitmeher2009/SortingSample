package sort.mergesort;

//divide and conquer the combine rule
//space complexity - O(n)
//Time complexity - 2T(n/2)+T(n) -- O(nlogn)
public class MergeSortReverse {

    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};

        mergeSort(numberArray, numberArray.length);

        for(int i =0; i <numberArray.length; i++){
            System.out.print(numberArray[i] + " | ");
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r);
    }


    public static void merge(
            int[] a, int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] > r[j]) {
                a[k] = l[i];
                k++; i++;
            }
            else {
                a[k] = r[j];
                k++; j++;
            }
        }
        while (i < left) {
            a[k] = l[i];
            k++; i++;
        }
        while (j < right) {
            a[k] = r[j];
            k++; j++;
        }
    }
}
