package Hashing;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter login credentials : ");
        System.out.println("Username : ");
        String username  = sc.nextLine();
        System.out.println("Password : ");
        String password  = sc.nextLine();

        LoginService loginService = new LoginService();
        boolean isvalid = loginService.validate(username,password);

        if(isvalid){
            System.out.println("Welcome "+ username);
        }
        else{
            System.out.println("Sorry wrong credentials");
        }
        sc.close();
    }
}
