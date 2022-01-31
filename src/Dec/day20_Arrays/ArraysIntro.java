package Dec.day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a var that can contain 5 names

        String [] names = new String[5];
        names[0] = "gunay";
        names[1] = "mikw";
        names[2] = "gym";
        names[3] = "hulia";
        names[4] = "waleed";

        System.out.println(Arrays.toString(names));

        String [] days = {"Mon", "Tus", "Wed", "Thur", "Fri", "Sat", "Sun"}; // instead of doing [7]

        System.out.println(Arrays.toString(days));
        int num = 7;

        if (num<1 || num >7){
            System.out.println("invalid");
            System.exit(0);
        }
        System.out.println(days[num-1]); // -1 since array start at 0
        System.out.println("_____________________");

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Oct", "Nov", "Dec"};
        int n = 3;

        if (num<1 || num >12){
            System.out.println("invalid");
            System.exit(0);
        }

        System.out.println(Arrays.toString(month));
        System.out.println(month[num-1]);

        System.out.println("_____________________");

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }

    }
}
