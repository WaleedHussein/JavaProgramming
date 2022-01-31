package Nov.day15_ForLoop;

public class Finra {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if (i%15==0){
                System.out.print("finra ");
            }else if (i%3==0){
                System.out.print("fin ");
            }else if (i%5==0){
                System.out.print("ra ");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
