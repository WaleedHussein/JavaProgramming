package Feb.GentritTasks;

public class GentritAssignment {

    public static void main(String[] args) {

        finra();
        identify(5);
        divide(34,5);
        divide(4,-4);

    }

    public static void identify(int num){
        String result = "";
        if (num % 2 == 0){
            result = "even";
        }else result = "odd";

        System.out.println(result);
    }

    public static void finra(){

        String result = "";
        for (int i = 1; i <= 30 ; i++) {
            if (i%15 ==0)
                result += "Finra ";
            else if (i%3 == 0) result += "Fin ";
            else if (i%5 == 0) result += "Ra ";
            else result += i + " ";
        }
        System.out.println(result);
    }

    public static void divide (int a, int b){

        int result = 0;

        while (a>b) {

                a -= b;
                result++;

        }
        System.out.println("a/b = " + result + ", and the remaining is " + a);

    }


}

