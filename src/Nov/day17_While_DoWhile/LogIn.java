package Nov.day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter username");
        String u = scan.next();
        System.out.println("enter password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("logged in");
        }else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                System.out.println("incorrect username or pass, reenter");
                System.out.println("enter username");
                u = scan.next();
                System.out.println("enter password");
                p = scan.next();
                attempts--;
            }


            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("logged in");
            } else {
                System.out.println("locked");
            }
        }

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is
                 lucked."
 */