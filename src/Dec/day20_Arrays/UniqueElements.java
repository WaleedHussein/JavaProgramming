package Dec.day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String words [] = {"Java", "Java","c#", "python", "python"};


        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int freq = 0;


            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(element)) {
                    freq++;
                }
            }

            if (freq==1){
                System.out.println("element = " + element);
            }

        }
    }
}
