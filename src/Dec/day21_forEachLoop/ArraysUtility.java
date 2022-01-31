package Dec.day21_forEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------");

        int[]scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("min score is "+ scores[0]);
        System.out.println("max is "+ scores[scores.length-1]);

        String names [] = {"Anna", "Ahmet", "Gunay", "Zuhal", "Maria"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------");
        System.out.println();

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);
        System.out.println("--------------------------------");
        System.out.println();

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'c', 'a', 'b'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);

    }

}
