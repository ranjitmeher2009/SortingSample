package sort.mergesort;

//divide and conquer the combine rule
//space complexity - O(n)   -- extra space required to merge in last
//Time complexity - 2T(n/2)+T(n) -- O(nlogn)
public class MergeSortString {

    public static void main(String[] args) {
        String[] stringArray = {"Ram", "Ravi", "Kalyani", "kalyani", "Reeta", "Ranjan", "Harshita", "Abhi", "Aakash", "Yak"};

        mergeSort(stringArray, stringArray.length);

        for(int i =0; i <stringArray.length; i++){
            System.out.print(stringArray[i] + " | ");
        }
    }

    public static void mergeSort(String[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        String[] l = new String[mid];
        String[] r = new String[n - mid];

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
            String[] a, String[] l, String[] r) {

        int left = l.length;
        int right = r.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareToIgnoreCase(r[j]) < 0) {
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
