package Controllers;

import User.User;
import java.util.Scanner;
import Controllers.Database;

public class Create {
    public static boolean createController(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, email,phone,exit= "YES";
        int id;
        while (exit.equals("YES")){
            try {
                System.out.println("Enter a whole number");
                id = sc.nextInt();
                System.out.println("Enter the first name");
                firstName = sc.next();
                System.out.println("Enter the last name");
                lastName = sc.next();
                System.out.println("Enter the email");
                email = sc.next();
                System.out.println("Enter the phone");
                phone = sc.next();

                User newUser = new User(id,firstName,lastName,email,phone);
                System.out.println(newUser);
                System.out.println(Database.usersDb.save(newUser));
                System.out.print("Do you want to create another user? YES/NO:");
                exit = sc.next().toUpperCase();
                if (exit.equals("NO")) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return false;
    }
}