package Dec.day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {

      String str = "aabbceedff";

      String result = removeDuplicate(str);
        System.out.println("result = " + result);


    }

    public static String removeDuplicate(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){ // "" added to char allow to be used in string
                result+=each;

            }
        }
        return result;
    }


}
