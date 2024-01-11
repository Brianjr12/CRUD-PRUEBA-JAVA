package Controllers;
import java.util.Scanner;
import Controllers.Database;

public class GetById {
    public static boolean getByIdController(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit= "YES";
        int id;
        while (exit.equals("YES")){
            try {
                System.out.println("Enter user ID of to get it");
                id = sc.nextInt();
                System.out.println(Database.usersDb.getUserById(id));
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
