package Controllers;
import User.User;
import Controllers.Database;
public class GetAll {
    public static boolean getAllController(String[] args) {
        try {
            System.out.println("There are " + Database.usersDb.getAll().size() + " in the database");
            for (User users: Database.usersDb.getAll()) {
                System.out.println(users);
            }
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}
