package Dec.day27_WrapperClasses;

import utilities.ArraysUtility;

public class RemoveDuplicates {

    public static int [] removeDuplicates (int [] array){

        int [] result = {};

        for (int each : array){
            if (!ArraysUtility.contains(result,each)){
               result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
