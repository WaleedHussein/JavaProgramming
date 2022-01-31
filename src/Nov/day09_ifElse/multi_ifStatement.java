package Nov.day09_ifElse;

public class multi_ifStatement {

    public static void main(String[] args) {

        int num1 = 200, num2 = 200;
        if (num1>num2){
            System.out.println("num1 is largest: " + num1);
        }else {
            System.out.println("num2 is largest: " + num2);
        }
        System.out.println("----------------------");
        int age = 20;
        String name = "Mike";
        if (age >= 21){
            System.out.println(name +" can drink alcohol");
        }else {
            System.out.println(name + " cannot drink");
        }
        if (num1>num2){
            System.out.println("num1 is largest: " + num1);

        }else if (num1<num2){
            System.out.println("num2 is largest: " + num2);
        }else{
            System.out.println("its equal");
        }


    }
}
