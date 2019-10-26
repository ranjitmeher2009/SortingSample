package sort.selectionsort;

// sort and array by searching + sorting
// search min element and place on 1st place then search 2nd min and place on 2nd apply same process till last
public class SelectionSortString {
    public static void main(String[] args) {
        String[] stringArray = {"Ram", "Ravi", "Kalyani", "kalyani", "Reeta", "Ranjan", "Harshita", "Abhi", "Aakash", "Yak"};
        int min;
        String temp = "";

        for(int i = 0; i < stringArray.length; i++){
            min = i;
            System.out.print("\nRound "+ (i + 1) + ": ");
            for(int j = i+1; j < stringArray.length; j++){
                System.out.print("\n ---comparision of "+ stringArray[j] + " & " + stringArray[min] + " & min is "+ min);
                if(stringArray[j].compareToIgnoreCase(stringArray[min]) < 0){
                    min = j;
                }
            }
            temp = stringArray[i];
            stringArray[i] = stringArray[min];
            stringArray[min] = temp;
        }

        System.out.print("--  ");
        for(int x = 0; x < stringArray.length; x++) {
            System.out.print(stringArray[x] + " | ");
        }
    }
}
