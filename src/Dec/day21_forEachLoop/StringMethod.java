package Dec.day21_forEachLoop;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Java";
        char ch [] = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        for (char each : ch){
            System.out.println(each);
        }

        System.out.println("---------------------");

        String str1 = "I love learning Java programming language";

        String arr1 [] = str1.split(" ");
        System.out.println(Arrays.toString(arr1));
        //if i use a word, it split the sentance into 2 array item,
        // if I use " ", it  splits into words,
        // if I use "" it splits into each char including spaces,
        // if splitting by a dot, we have to use \\ before the dot

        String str2 = "I. love. learning. Java. programming. language";
        String arr2 [] = str2.split("\\. ");

        System.out.println(Arrays.toString(arr2));


    }
}
