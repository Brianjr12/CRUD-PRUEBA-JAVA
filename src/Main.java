import Menu.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit){
            System.out.println("MAIN MENU");
            System.out.println("1. Create a user");
            System.out.println("2. Assign a role to a user");
            System.out.println("3. Get a user by his id");
            System.out.println("4. Delete a user");
            System.out.println("5. Get all users");
            System.out.println("6. Exit");
            System.out.print("Select a number Options: ");
            try {
                option = sc.nextInt();
                if (option<= 6 && option >= 0){
                    exit = Menu.main(option,sc);
                }

                if (option != 6){
                    sc.nextLine();
                }

            } catch (java.util.InputMismatchException  e){
                System.out.println("Error: Enter a valid value");
            } finally {
                if (exit == false){
                    System.out.println("Press ENTER to continue");
                    sc.nextLine();
                }
            }

        }
    }
}