package Nov.day11_Switch_Scanner;

public class grade {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("passed");
                break;
            default:
                System.out.println("Failed");
        }
    }
}
