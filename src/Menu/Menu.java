package Menu;

import Controllers.*;

import java.util.Scanner;

public class Menu {
    public static boolean main(int option, Scanner sc) {
        boolean state = false;
        switch (option){
            case 1:
                state = Create.createController(null);
                break;
            case 2:
                state = AssignedRole.assignedRoleController(null);
                break;
            case 3:
                state = GetById.getByIdController(null);
                break;
            case 4:
                state = Delete.deleteController(null);
                break;
            case 5:
                state = GetAll.getAllController(null);
                break;
            case 6:
               state = Exit.exitMenu();
                break;
            default:
                System.out.println("Invalid entered value");
                break;
        }

        if (option != 6) {
            System.out.println(" ");
            System.out.println("Press ENTER to return to the Main Menu");
            sc.nextLine();
        }
        return state;
    }
}
