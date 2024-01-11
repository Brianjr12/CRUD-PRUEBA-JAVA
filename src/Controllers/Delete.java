package Controllers;
import java.util.Scanner;
import Controllers.Database;

public class Delete {
    public static boolean deleteController(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit= "YES";
        int id;
        while (exit.equals("YES")){
            try {
                System.out.println("Enter the ID of the user to delete");
                id = sc.nextInt();
                System.out.println(Database.usersDb.delete(id));
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
