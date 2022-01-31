package Dec.day21_forEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String students [] = {"Anna", "Ahmet", "Gunay", "Zuhal", "Maria"};
        String [] earlybirds = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlybirds));
//copyof starts from 0

       // students = Arrays.copyOf(students, 2);

        String[] students2 = Arrays.copyOfRange(students,1, 4);//4 is excluded



        System.out.println(Arrays.toString(students2));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );

        System.out.println(Arrays.toString(ch2));

        System.out.println("---------------------------");

        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores, 3, 7+1);

        System.out.println(Arrays.toString(result));

    }
}
