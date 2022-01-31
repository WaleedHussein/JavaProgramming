package Dec.day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int [] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));

        int [] scores = new int[5];
        scores [scores.length-1] = 77;
        scores[1] = 88;
        System.out.println(Arrays.toString(scores));

    }
}
