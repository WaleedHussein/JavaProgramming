package Nov.day18_nestidLoop;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter user name");
        String user = scan.next();
        System.out.println("enter pass");
        String pass = scan.next();

        if (user.equals("cydeo") && pass.equals("wooden")){
            System.out.println("logged in");
        }else {
            for (int i = 0; i < 4; i++) {


                System.out.println("wrong user or pass, enter again");
                System.out.println("enter user name");
                user = scan.next();
                System.out.println("enter pass");
                pass = scan.next();

                if (user.equals("cydeo") && pass.equals("wooden")) {
                    System.out.println("logged in");
                    break;
                }

            }
            if (!(user.equals("cydeo") && pass.equals("wooden"))){
                System.out.println("locked out");
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