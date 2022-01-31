package Dec.day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,3,4,5,6,1,1,1,7,8,9,1));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        Collections.swap(list, 2, 5);
        System.out.println("list = " + list);

        System.out.println("--------------------------");

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("--------------------------");

        Collections.replaceAll(list,1, 44);
        System.out.println(list);

        int frequency = Collections.frequency(list, 44);
        System.out.println("frequency = " + frequency);

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java", "Python", "Javascirpt", "c++"));

        int countJava = Collections.frequency(list3,"Java");
        int countPython = Collections.frequency(list3,"Python");

        System.out.println(countJava == countPython);

    }
}
