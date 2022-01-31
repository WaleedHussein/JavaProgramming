package Dec.day27_WrapperClasses;

public class ReplaceAll {

    //This method will replace certain values with new values
    public static int [] replaceAll (int [] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //This method will replace certain values with new values
    public static double [] replaceAll (double [] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //This method will replace certain values with new values
    public static char [] replaceAll (char [] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //This method will replace certain values with new values
    public static String [] replaceAll (String [] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }
    
    
}
