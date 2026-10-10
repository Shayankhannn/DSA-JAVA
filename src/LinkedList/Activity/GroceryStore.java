package LinkedList.Activity;

import java.util.LinkedList;

public class GroceryStore {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Milk");
        list.add("Bread");
        list.add("Eggs");
        list.add("Butter");
        list.add("Tomatoes");
        System.out.println(list);

        list.set(1,"Whole wheat bread");
        System.out.println("updated list"+list);
        list.remove(3);

        list.add("Cheese");

        System.out.println("final list"+list);
    }
}
