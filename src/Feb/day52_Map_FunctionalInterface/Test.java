package Feb.day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        //func1: create func that display if the numb is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n%2 == 0){
                System.out.println(n + " is even");
            }else System.out.println(n + " is odd");
        };

        oddOrEvenNumber.apply(20);


        //func2: create a func that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlochol = (age) -> {
            if (age>= 21){
                System.out.println("person is eligible to buy alcohol");
            }else System.out.println("person is not eligible to buy alcohol");
        };

        eligibleToBuyAlochol.apply(18);
        eligibleToBuyAlochol.apply(22);


        //func3: create a func that can display the cube of a number

        MyFirstFunctionalInterface printCube;
        printCube = n -> System.out.println("The cube of " + n +" is " + n*n*n);
        //if there is only one line, no need to use {}, one int also dont need ()

        printCube.apply(3);

        //func4: create a func that can check if numb is evenly divisible by 3 and 5

        MyFirstFunctionalInterface divisibleBy3And5 = n ->
        {
            if (n %15 == 0) {
                System.out.println("number is divisible by 3 and 5");
            }else System.out.println("number is not divisible by 3 and 5");

        };

        divisibleBy3And5.apply(45);

    }
}
