
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class TodoList {

    private ArrayList<String> todolist;

    public TodoList() {
        this.todolist = new ArrayList<String>();
    }

    public void add(String task) {
        todolist.add(task);
    }

    public void print() {
        for (int i = 0; i < todolist.size(); i++) {
            System.out.println(i + 1 + ": " + todolist.get(i));
        }
    }
    
    public void remove(int number) {
        todolist.remove(number - 1);
    }
}
