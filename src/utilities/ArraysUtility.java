package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if(each == element){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }

        return result;
    }


    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }


    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if( each.equals(element) ){
                result = true;
            }
        }

        return result;
    }


    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


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

    // This method will reverse an array, int
    public static int [] reverseArray (int[] array){
        int [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // This method will reverse an array, double
    public static double [] reverseArray (double[] array){
        double [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // This method will reverse an array, char
    public static char [] reverseArray (char[] array){
        char [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // This method will reverse an array, String
    public static String [] reverseArray (String[] array){
        String [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // replace an element from an int array
    public static int[] replace(int [] array, int index, int newElement){

        if (index<0|| index> array.length-1){
            System.out.println("invalid index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace an element from a double array
    public static double[] replace(double[] array, int index, double newElement){

        if (index<0|| index> array.length-1){
            System.out.println("invalid index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace an element from a char array
    public static char[] replace(char[] array, int index, char newElement){

        if (index<0|| index> array.length-1){
            System.out.println("invalid index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace an element from a String array
    public static String[] replace(String[] array, int index, String newElement){

        if (index<0|| index> array.length-1){
            System.out.println("invalid index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

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

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //the method inserts the given int element to the given index of the array and returns the new array
    public static int [] insert (int [] array, int index, int element){
        int ins [] = new int[array.length+1];

        for (int i = 0, j = 0; i < ins.length;j++, i++) {
            if (i == index){
                ins[i] = element;
                j--;
            }else {
                ins[i] = array[j];
            }
        }
        return ins;
    }

    //the method inserts the given double element to the given index of the array and returns the new array
    public static double [] insert (double [] array, int index, double element){
        double ins [] = new double[array.length+1];

        for (int i = 0, j = 0; i < ins.length;j++, i++) {
            if (i == index){
                ins[i] = element;
                j--;
            }else {
                ins[i] = array[j];
            }
        }
        return ins;
    }

    //the method inserts the given char element to the given index of the array and returns the new array
    public static char [] insert (char [] array, int index, char element){
        char ins [] = new char[array.length+1];

        for (int i = 0, j = 0; i < ins.length;j++, i++) {
            if (i == index){
                ins[i] = element;
                j--;
            }else {
                ins[i] = array[j];
            }
        }
        return ins;
    }

    //the method inserts the given String element to the given index of the array and returns the new array
    public static String [] insert (String [] array, int index, String element){
        String ins [] = new String[array.length+1];

        for (int i = 0, j = 0; i < ins.length;j++, i++) {
            if (i == index){
                ins[i] = element;
                j--;
            }else {
                ins[i] = array[j];
            }
        }
        return ins;
    }

    //int. the method swaps the element at index i with the element at index j, and returns the new array
    public static int [] swap(int[] array, int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //double. the method swaps the element at index i with the element at index j, and returns the new array
    public static double [] swap(double[] array, int i, int j){

        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //char. the method swaps the element at index i with the element at index j, and returns the new array
    public static char [] swap(char[] array, int i, int j){

        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //String. the method swaps the element at index i with the element at index j, and returns the new array
    public static String [] swap(String[] array, int i, int j){

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }



}