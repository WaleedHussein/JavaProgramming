package utilities;

public class MathUtility {
    // 2.1 Create a method that can return the sum of two integers
    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    // 2.2 Create a method that can return the sum of two decimal numbers
    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    // 2.3 Create a method that can return the subtraction of two integers
    public static int subOfNumbers(int num1, int num2){
        return num1-num2;
    }

    // 2.4 Create a method that can return the subtraction of two decimals
    public static double subOfNumbers(double num1, double num2){
        return num1-num2;
    }

    //  2.5 Creat a method that can return the multiplication of two integers
    public static int multiplicationOfNumbers(int num1, int num2){
        return num1*num2;
    }

    // 2.6 Create a method that can return the multiplication of two decimals
    public static double multiplicationOfNumbers(double num1, double num2){
        return num1*num2;
    }

    // 2.7 Create a method that passes two double parameters and return the division reslt
    public static double divisionOfNumbers(double num1, double num2){
        return num1/num2;
    }

    // 2.8 Create a method that can check if an integer is even number
    public static boolean checkIntIsEvenNum(int num){
        return num%2==0;
    }

    // 2.9 Create a method that can check if an integer is odd number
    public static boolean checkIntIsOddNum(int num){
        return num%2!=0;
    }

    // 2.10 Create a method that can return the maximum number between two integers
    public static int maxNumber(int n1, int n2){
        int max =0;

        if (n1>n2){
             max = n1;
        }
        else {
             max = n2;
        }
        return max;
    }

    // 2.11 Create a method that can return the maximum number between two decimal numbers

    public static double maxNumber(double n1, double n2){
        double max =0;

        if (n1>n2){
            max = n1;
        }
        else {
            max = n2;
        }
        return max;
    }
    
    // 2.12 Create a method that can return the minimum number between two integers
    public static int minNumber (int n1, int n2){
        int min =0;

        if (n1<n2){
            min = n1;
        }
        else {
            min = n2;
        }
        return min;
    }
    
    // 2.13 Create a method that can return the minimum number between two decimal numbers
    public static double minNumber (double n1, double n2){
        double min =0;

        if (n1<n2){
            min = n1;
        }
        else {
            min = n2;
        }
        return min;
    }

    // 2.14 Create a method that can return the square of an integer. Ex: square(2) ==> 4
    public static int square(int num){
        return num*num;
    }

    // 2.15 Create a method that can return the square of a double
    public static double square(double num){
        return num*num;
    }

    // 2.16 Create a method that can return the cube of an integer
    public static int cube(int num){
        return num*num*num;
    }

    // 2.17 Create a method that can return the cube of a double
    public static double cube(double num){
        return num*num*num;
    }
}
