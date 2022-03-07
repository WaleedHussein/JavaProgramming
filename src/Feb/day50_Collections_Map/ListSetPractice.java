package Feb.day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,2,3,5,2,1));

        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list);

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        ((Stack)chars).pop();

        System.out.println(chars);

        List <String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Mike", "James", "Waleed", "Nawar"));
        System.out.println(names);

        ((LinkedList)  names).poll(); // poll() = FIFO

        System.out.println(names);

    }
}
