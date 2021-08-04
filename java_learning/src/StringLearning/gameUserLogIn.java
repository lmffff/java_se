package StringLearning;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class gameUserLogIn {
    public static void main(String[] args) {
        String username = "liu";
        String password = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name:");
        String name = sc.nextLine();
        System.out.println("please input your password:");
        String pass = sc.nextLine();

        if(username.equals(name)){
            if (password.equals(pass)){
                System.out.println("success!");
            }
            }else {
            System.out.println("error!");
        }
        }
}
