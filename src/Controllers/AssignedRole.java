package Controllers;
import java.util.Scanner;

import User.Role;
import User.User;

public class AssignedRole {
    public static boolean assignedRoleController(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, exit= "YES";
        int idRole,idUser;
        while (exit.equals("YES")){
            try {
                System.out.println("Enter a whole number");
                idRole = sc.nextInt();
                System.out.println("Enter the name of a role");
                name = sc.next();
                Role roles = new Role(idRole,name);
                System.out.println(roles);
                System.out.println("Enter the ID of the user to assign the role");
                idUser = sc.nextInt();
                User user = Database.usersDb.getUserById(idUser);
                System.out.println(user.addRole(roles));
                System.out.println(user);
                System.out.print("Do you want to Delete another user? YES/NO:");
                exit = sc.next().toUpperCase();
                if (exit.equals("NO")) {
                    break;
                }
            } catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return false;
    };
}
