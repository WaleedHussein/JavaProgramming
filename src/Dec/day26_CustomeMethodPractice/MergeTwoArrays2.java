package Dec.day26_CustomeMethodPractice;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {

    // This method will merge 2 arrays, integer
    public static int[] merge (int [] arr1, int[] arr2){
       int [] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }

        return result;
    }

    // This method will merge 2 arrays, double
    public static double[] merge (double [] arr1, double[] arr2){
        double [] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }

        return result;
    }


    // This method will merge 2 arrays, char
    public static char[] merge (char [] arr1, char[] arr2){
        char [] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }

        return result;
    }


    // This method will merge 2 arrays, String
    public static String[] merge (String [] arr1, String[] arr2){
        String [] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each); //holding ctrl and clicking addElement will show me options
        }

        return result;
    }
        


}
