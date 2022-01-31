package Dec.day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int [] number = {323,4,22,44,70,1};
        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number [i]< min){
                min = number[i];
            }

        }
        System.out.println(min);
    }
}
