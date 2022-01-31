package Dec.day26_CustomeMethodPractice;

import utilities.ArraysUtility;

public class UniqueElements {

    // returns the unique int elements of the array as a new int array
    public static int[] uniqueElements (int [] array, int number){
        int [] result = {}; // the array will be replaced with a new array, this is a temp one.

        for (int each : array){
          if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if freq is 1, element is unique
             result =  ArraysUtility.addElement(result,each);
          }
        }
return result;
    }

    // returns the unique double elements of the array as a new array
    public static double[] uniqueElements (double [] array, double number){
        double [] result = {}; // the array will be replaced with a new array, this is a temp one.

        for (double each : array){
            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if freq is 1, element is unique
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    

    // returns the unique char elements of the array as a new char array
    public static char[] uniqueElements (char [] array, char number){
        char [] result = {}; // the array will be replaced with a new array, this is a temp one.

        for (char each : array){
            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if freq is 1, element is unique
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array
    public static String[] uniqueElements (String [] array, String number){
        String [] result = {}; // the array will be replaced with a new array, this is a temp one.

        for (String each : array){
            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if freq is 1, element is unique
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
