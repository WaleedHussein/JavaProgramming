package Nov.day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJava";
        int freq = 0;

        for (int i = 0; i < str.length() -3; i++) { // -4 since substring should not exceed 7 indexes
            String eachSub = str.substring(i,i+4);
         //   System.out.println("eachSub = " + eachSub);
            if (eachSub.equals("Java")){
                freq++;
            }
        }
        System.out.println("freq = " + freq);
    }
}
