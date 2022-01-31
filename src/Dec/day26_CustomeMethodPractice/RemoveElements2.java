package Dec.day26_CustomeMethodPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    public static int[] removeElement(int[] array, int index) {

        int[] result = {};

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {  // if the index of array is matching with the given index
              result =  ArraysUtility.addElement(array,index);
            }
          //  result[j++] = array[i];
        }

        return result;
    }
}
