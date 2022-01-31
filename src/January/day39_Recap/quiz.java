package January.day39_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {
        String [] city = {"Boston", "Houston","Austin","Lincoln","Tulsa"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(city));
        int a = list.size();

        for (String str : list) {

            String rev = "";

            for (int i = str.length()-1; i >= 0 ; i--) {
                rev+= str.charAt(i);
            }
            list.set(--a,rev);
        }

        System.out.println(list);
    }
}
