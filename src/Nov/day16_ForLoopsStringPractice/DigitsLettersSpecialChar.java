package Nov.day16_ForLoopsStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {

        String str = " Cydeop123214School@#$woodenspoon";

        String digits = "", letters = "", specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9'){
                digits += ch;
            }else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else {
                specialChars += ch;
            }



        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
