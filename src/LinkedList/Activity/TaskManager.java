package LinkedList.Activity;

import java.util.LinkedList;
import java.util.ListIterator;

public class TaskManager {
    public static void main(String[] args){
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Check emails.");
        tasks.add("Attend a team meeting.");
        tasks.add("Complete project report.");
        tasks.addFirst("Review today's schedule");
        tasks.add(2,"Prepare presentation slides");
        tasks.removeLast();
        ListIterator<String> iterator = tasks.listIterator();
            System.out.println("Traversing forward through the tasks:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
            System.out.println("Traversing backward through the tasks:");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


    }
}
