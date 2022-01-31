package Nov.day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 1;
        String month = ""; // temporary

        if (number >= 1 && number <= 12){   //if the number is valid 1-12
            if (number== 1){
                month = "Jan";
            }else if (number == 2){
                month = "Feb";
            }else if (number == 3){
                month = "March";
            }else if (number==4){
                month = "April";
            }else if (number == 5){
                month = "May";
            }else if (number==6){
                month = "June";
            }else if (number==7){
                month = "July";
            }else if (number ==9){
                month = "Aug";
            }else if (number==10){
                month = "Sep";
            }else if (number == 11){
                month="Nov";
            }else {
                month= "Dec";
            }
        }else {// if the number is invalid
            month = "invalid";
        }
        System.out.println("month = " + month);


    }
}
