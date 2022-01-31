package January.day36_Inheritance.Encapsulation;

import java.util.ArrayList;
import java.util.Collections;

public class nawar2 {
    public static void main(String[] args) {
        String s = "--!--qwe--r-_?-tyf..3.gd.--9-";

        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);//getting the character at current index
            list.add(currentCharacter);//adding the character to the list
        }
        int startingJ = list.size();

        for (int i = 0; i < list.size(); i++) {

            if (Character.isLetter(list.get(i))) {
                for (int j = startingJ - 1; j >= 0; j--) {
                    if (Character.isLetter(list.get(j)) && j>i) {
                        Collections.swap(list, i, j);
                        startingJ = j;
                        break;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
