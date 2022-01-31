package Dec.day21_forEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10,4,24,2,0,3};

        int max = numbers[0];



        for (int each : numbers) {  //shortcut numbers.for + enter
           if (each>max){
               max = each;
           }
        }


        System.out.println(max);
    }
}
