package Dec.day21_forEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70};
        for (int i = 0; i < numbers.length; i++) {
            int eachelements = numbers[i];
            System.out.print(eachelements+ " ");
        }

        for (int each : numbers ){

            System.out.println(each);

        }



    }
}
