package Dec.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

      //  int [] arr = {1,2,3,4,5,6,7,8};
        //System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,0,4,0,6,0,8));

        int size = list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize = list.size();
        int totalzeros = size-newSize;
        System.out.println("totalzeros = " + totalzeros);

        for (int i = 0; i < totalzeros; i++) {
            list.add(0);
        }

        System.out.println("list = " + list);

        System.out.println("--------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);

        String str = "23rfsdgs74dgwe4#%#$wfse";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);
        System.out.println("chars = " + chars);
        System.out.println("letters = " + letters);

        letters.removeIf( p -> !Character.isLetter(p));

        System.out.println("letters = " + letters);
        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p -> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars);
       specialChar.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));

        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);
        System.out.println("specialChar = " + specialChar);




    }

}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */