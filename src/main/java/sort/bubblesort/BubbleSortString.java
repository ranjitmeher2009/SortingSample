package sort.bubblesort;

public class BubbleSortString {
    public static void main(String[] args) {
        String[] stringArray = {"Ram", "Ravi", "Kalyani", "kalyani", "Reeta", "Ranjan", "Harshita", "Abhi", "Aakash", "Yak"};
        String temp ="";

        for(int i=0; i < stringArray.length; i++){
            int flag = 0;
            System.out.print("\nRound "+ (i + 1) + ": ");
            for(int j = 0;  j< stringArray.length -1 - i; j++){
                System.out.print("comparision of "+ stringArray[j] + " & " + stringArray[j+1] + " | ");
                if(stringArray[j].compareToIgnoreCase(stringArray[j+1]) > 0) {
                    temp = stringArray[j];
                    stringArray[j] = stringArray[j+1];
                    stringArray[j+1] = temp;
                    flag =1;
                }
            }
            System.out.print("--  ");
            for(int x = 0; x < stringArray.length; x++) {
                System.out.print(stringArray[x] + " | ");
            }
            if(flag == 0){
                break;
            }
        }
    }
}
