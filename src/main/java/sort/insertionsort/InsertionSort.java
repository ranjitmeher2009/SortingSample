package sort.insertionsort;

// pick element from 1st index(not 0th), compare with its previous elements and place in correct position
public class InsertionSort {
    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        int temp =0;

        for(int i =1; i <numberArray.length; i++){
            temp = numberArray[i];
            int j=i;
            System.out.print("\ntemp " + temp);
            /*for(; j > 0 && numberArray[j-1] > temp; j--){
                System.out.print("comparision of "+ numberArray[j] + " & " + temp + " | ");
                numberArray[j] = numberArray[j-1];
            }*/

            while(j > 0 && numberArray[j-1] > temp){
                System.out.print("   ----comparision of "+ numberArray[j-1] + " & " + temp + " | ");
                numberArray[j] = numberArray[j-1];
                j--;
            }
            numberArray[j] = temp;

            System.out.print("\n\n----------  ");
            for(int x = 0; x < numberArray.length; x++) {
                System.out.print(numberArray[x] + " | ");
            }
        }
    }
}
