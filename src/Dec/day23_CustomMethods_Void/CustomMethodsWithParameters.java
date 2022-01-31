package Dec.day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(7);
        System.out.println("-------------------------");
        ageOfPerson(1984);



    }





    //create a function that can check if a number is off or even
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson (int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is "+ age);
    }

    //create a function that can print all numbers between x and y
    public static void xAndY (int x, int y){

    }

}
