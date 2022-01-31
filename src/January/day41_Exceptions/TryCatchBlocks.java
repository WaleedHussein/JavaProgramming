package January.day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("test started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic exception was occurred");

        }

        System.out.println("Test completed");

        System.out.println("=================================");

        System.out.println("Test 2 started");

        int[] numbers = {1,2,3,4,5};


        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        }catch (RuntimeException e){ // if we don't know what is the exception, use runtime bcz its the parent of exceptions

           // e.printStackTrace();//gives full description of the exception error

            System.out.println(e.getMessage());//gives a brief description of the problem

        }

        System.out.println("Test 2 completed");

        System.out.println("=======================");

        System.out.println("Test 3 started");

        try {
            System.out.println("Cydeo".substring(2,0));
            System.out.println("Try Block");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test 3 completed");


        try {
            FileInputStream file = new FileInputStream("PAth");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
