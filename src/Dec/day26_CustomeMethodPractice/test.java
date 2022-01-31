package Dec.day26_CustomeMethodPractice;

import utilities.MathUtility;

public class test {
    public static void main(String[] args) {


        int n1 = 5, n2 = 4, maxInt = 0, minInt = 0;
        double n3 = 2.3, n4 = 3.4, maxDoub = 0, minDoub = 0;

        maxInt = MathUtility.maxNumber(n1,n2);
        maxDoub = MathUtility.maxNumber(n3,n4);
        minInt = MathUtility.minNumber(n1, n2);

        System.out.println("maxInt = " + maxInt);
        System.out.println("maxDoub = " + maxDoub);
        System.out.println("minInt = " + minInt);
        System.out.println("-------------");

        System.out.println(MathUtility.square(n1));






    }}