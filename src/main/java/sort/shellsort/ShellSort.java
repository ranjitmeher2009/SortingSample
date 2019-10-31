package sort.shellsort;

public class ShellSort {
    public static void main(String[] args) {
        int[] numberArray = {34, 12, 9, 3, 57, 5, 67, 45, 94};
        int length = numberArray.length;

        for(int gap = length/2; gap >= 1; gap/=2){
            for(int j = gap; j <length; j++){
                int temp = 0;
                for(int i = j - gap; i >= 0; i = i - gap){
                    if(numberArray[i + gap] > numberArray[i]){
                        break;
                    }else{
                        temp = numberArray[i+gap];
                        numberArray[i+gap] = numberArray[i];
                        numberArray[i] = temp;
                    }
                }
            }
        }

        System.out.print("--- ");
        for(int i =0; i <numberArray.length;i++) {
            System.out.print(numberArray[i] + " | ");
        }
    }
}
