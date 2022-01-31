package Nov.day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 100;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("invalid");
        }
        System.out.println("________________________");
        int num = 5;
        if (num >= 1 && num <= 7){
            if (num == 1){
                System.out.println("monday");
            }else  if (num == 2){
                System.out.println("tus");
            }else if (num==3){
                System.out.println("Wed");
            }else if (num == 4){
                System.out.println("Thur");
            }else if (num == 5){
                System.out.println("Fri");
            }else if (num==6){
                System.out.println("Sat");
            }else {
                System.out.println("Sund");
            }
        }else {
            System.out.println("Invalid");
        }
        System.out.println("------------------------------");
        String result = "";   // to avoid getting initializing error we put ""

        if (score >= 0 && score <= 100) {
            if (score>= 90){
               result = "Execellent";
            }else if (score >= 80){ // i do not need to put < 90
               result = "B";
            }else if (score >= 70){
                result = "C";
            }else if (score >= 60){
                result = "D";
            }else {
                result = "Failed";
            }
        }else {
            result = "Failed";
        }
        System.out.println("result = " + result);

    }
}
