package Dec.day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};

        int [] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }

        System.out.println(Arrays.toString(result));
        System.out.println("==================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list2.size() - 1; i >= 0; i--) {

            //int each = list2.get(i);
            reverseList.add(list2.get(i));

        }
        System.out.println("reverse list = " +reverseList);

    }
}
