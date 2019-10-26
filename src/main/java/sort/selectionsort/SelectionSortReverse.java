package sort.selectionsort;

// sort and array by searching + sorting
// search max element and place on 1st place then search 2nd max and place on 2nd apply same process till last
public class SelectionSortReverse {
    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        int min, temp =0;

        for(int i = 0; i < numberArray.length; i++){
            min = i;
            System.out.print("\nRound "+ (i + 1) + ": ");
            for(int j = i+1; j < numberArray.length; j++){
                System.out.print("\n ---comparision of "+ numberArray[j] + " & " + numberArray[min] + " & min is "+ min);
                if(numberArray[j] > numberArray[min]){
                    min = j;
                }
            }
            temp = numberArray[i];
            numberArray[i] = numberArray[min];
            numberArray[min] = temp;
        }

        System.out.print("--  ");
        for(int x = 0; x < numberArray.length; x++) {
            System.out.print(numberArray[x] + " | ");
        }
    }
}
