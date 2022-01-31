package Dec.day21_forEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70};
        int [] reverse = new int[numbers.length];
/*
        for (int i = numbers.length-1; i >= 0; i--){
            for (int j = 0; j <= numbers.length-1; j++) {
                reverse[j] = numbers[i];

            }

        }


 */
        for (int i = numbers.length - 1, j=0 ; i >= 0; i--, j++) {
            reverse[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reverse));
//array.forr = in reverse order for loop

    }
}
