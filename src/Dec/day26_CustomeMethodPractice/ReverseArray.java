package Dec.day26_CustomeMethodPractice;

import utilities.ArraysUtility;

public class ReverseArray {
    
    
    public static int [] reverseArray (int[] array){
        int [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
return result;
    }


    public static double [] reverseArray (double[] array){
        double [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }


    public static char [] reverseArray (char[] array){
        char [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }


    public static String [] reverseArray (String[] array){
        String [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }
    
    
}
