package sort.bubblesort;

public class BubbleSortReverse {
    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        int temp =0;

        for(int i=0; i < numberArray.length; i++){
            int flag = 0;
            System.out.print("\nRound "+ (i + 1) + ": ");
            for(int j = 0;  j< numberArray.length -1 - i; j++){
                System.out.print("comparision of "+ numberArray[j] + " & " + numberArray[j+1] + " | ");
                if(numberArray[j] < numberArray[j+1]) {
                    temp = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = temp;
                    flag =1;
                }
            }
            System.out.print("--  ");
            for(int x = 0; x < numberArray.length; x++) {
                System.out.print(numberArray[x] + " / ");
            }
            if(flag == 0){
                break;
            }
        }
    }
}
