package Nov.day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome", result = "";
        boolean validBrowser = browserName =="chrome" || browserName =="firefox" || browserName =="opera" ||
                browserName =="safari" ||browserName =="edge";
        if (validBrowser){
        if (browserName == "chrome") {
            result = "chrome browser is selected";
        }
            if (browserName == "firefox") {
                result = "chrome browser is selected";
            }
            if (browserName == "opera"){
                result = "chrome browser is selected";
            }
            if (browserName == "safari"){
                result = "chrome browser is selected";
            }else {
                result = "edge browser is selected";
            }}
            else {
                result = "invalid selection";
            }
        System.out.println(result);

            int n = 10;
            if (--n> 10){
                System.out.println("good"+n);
            }else if (n == 9){
                System.out.println("false"+n);
            }
    }
}
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */