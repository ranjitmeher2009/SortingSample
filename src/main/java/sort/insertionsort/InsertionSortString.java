package sort.insertionsort;

// pick element from 1st index(not 0th), compare with its previous elements and place in correct position, shift right to bigger element
public class InsertionSortString {
    public static void main(String[] args) {
        String[] stringArray = {"Ram", "Ravi", "Kalyani", "kalyani", "Reeta", "Ranjan", "Harshita", "Abhi", "Aakash", "Yak"};
        String temp ="";

        for(int i =1; i <stringArray.length; i++){
            temp = stringArray[i];
            int j=i;
            System.out.println();
            /*for(; j > 0 && numberArray[j-1] > temp; j--){
                System.out.print("comparision of "+ numberArray[j] + " & " + temp + " | ");
                numberArray[j] = numberArray[j-1];
            }*/

            while(j > 0 && (stringArray[j-1].compareToIgnoreCase(temp) > 0)){
                System.out.print("comparision of "+ stringArray[j-1] + " & " + temp + " | ");
                stringArray[j] = stringArray[j-1];
                j--;
            }
            stringArray[j] = temp;

            System.out.print("\n\n----------  ");
            for(int x = 0; x < stringArray.length; x++) {
                System.out.print(stringArray[x] + " | ");
            }
        }
    }
}
