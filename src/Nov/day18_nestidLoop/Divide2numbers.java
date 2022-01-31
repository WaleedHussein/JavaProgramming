package Nov.day18_nestidLoop;

public class Divide2numbers {
    public static void main(String[] args) {
        int a = 23, b = 4;
        int count = 0;

        while (a>= b){
            a = a-b;
            count++;
        }
        System.out.println(count+ "remain "+a);
    }
}
