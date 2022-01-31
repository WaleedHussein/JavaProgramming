package Dec.day21_forEachLoop;

public class reverseName {
    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) {
            String reverse = "";
            for (int j = each.length()-1; j >= 0; j--){

                reverse += each.charAt(j);


            }
            System.out.println(reverse);


        }



    }
}
