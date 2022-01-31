package Nov.day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int n = 57;
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("invalid");


        }
    }
}
