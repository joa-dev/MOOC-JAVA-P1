
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                input = scanner.nextLine();
                todolist.add(input);
            } else if (input.equals("list")) {
                todolist.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                input = scanner.nextLine();
                todolist.remove(Integer.valueOf(input));
            }
        }
    }
}
 