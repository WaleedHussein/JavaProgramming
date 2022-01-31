package Dec.day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ali", "Mike","Ahmed", "Waleed", "Ahmed", "James", "David"));

        employee.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println("employee = " + employee);
        System.out.println("----------------------");

        String [] names = {"Ali", "Mike","Ahmed","Maya", "Waleed", "Ahmed", "James", "David"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p -> p.startsWith("M"));

        System.out.println("list = " + list);


    }
}
