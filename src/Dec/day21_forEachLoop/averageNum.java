package Dec.day21_forEachLoop;

public class averageNum {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60};

        double sum = 0;

        for (int number : numbers) {
            sum+=number;
        }
        double avg = sum/numbers.length;

        System.out.println("avg = " + avg);

    }
}
