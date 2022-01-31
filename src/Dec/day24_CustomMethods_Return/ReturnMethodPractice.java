package Dec.day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

     int maxNumber = max(100,200);

        System.out.println("maxNumber = " + maxNumber);

        int multi = maxNumber*2;
        System.out.println("multi = " + multi);



    }

    public static int max(int num1, int num2){

        int result = 0;
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;

    }




}
