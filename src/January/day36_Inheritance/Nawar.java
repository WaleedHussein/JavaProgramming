package January.day36_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Nawar {
    public static void main(String[] args) {
        String str = "2wa$3lee#d4";
        System.out.println(str);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                result += str.charAt(i);
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);

        String reverse = "";
        for (int i = result.length()-1; i>= 0; i--) {
            reverse+= result.charAt(i);
        }
        System.out.println(reverse);

        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        char [] ch2 = new char[ch.length];

        int j = 0;
        for (int i = 0; i < ch.length; i++) { // 2wa$3lee#d4"

            if (j < reverse.length()) {

                if (ch[i] == result.charAt(j)) {

                    ch2[i] = reverse.charAt(j);
                    j++;
                } else {
                    ch2[i] = ch[i];
                }
            } else {

                ch2[i] = ch[i];
            }

        }

        System.out.println(Arrays.toString(ch2));

        String result2 = "";

        for (int m = 0; m < ch2.length; m++) {
            result2+=ch2[m];
        }

        System.out.println("result2 = " + result2);


        }
}

