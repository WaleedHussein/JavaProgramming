package Dec.day25_CustomeMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        double [] arr2 = {1.2,2,3.4,4,5};

        ArraysUtility.printEachElement(arr2);

        char [] arr3 = {'A', 'B', 'C'};
        ArraysUtility.printEachElement(arr3);

        String [] arr4 = {"Ahmet", "Mike", "Meko"};
        ArraysUtility.printEachElement(arr4);


    }
}
