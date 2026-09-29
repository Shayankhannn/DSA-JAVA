package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add("string");
        arrayList.add(123);

        ArrayList<String> lst = new ArrayList<>();
        lst.add("string");
        lst.add("only strings");

        ArrayList<String> lst2 = new ArrayList<>(Arrays.asList("string1","string2"));

        System.out.println("ArrayList from Arrays.asList: " + lst2);
        lst2.add("Apple");
        System.out.println("Updated ArrayList: " + lst2);

        // ARRAY LIST manipulation

        // add

        ArrayList<Integer> lst3 = new ArrayList<>(12);
    lst3.add(1); // will ad element at the end
    lst3.add(2); // will ad element at the end
    lst3.add(3); // will ad element at the end
    lst3.add(5); // will ad element at the end
    lst3.add(6); // will ad element at the end
    lst3.add(7); // will ad element at the end
        lst3.add(1,4); // will add element at index 1 and move element accordingly
        System.out.println("manipulated  ArrayList: " + lst3);


        // remove

        lst3.remove(0); // it will remove element at that index

//        lst3.clear(); - will remove everything from list
        System.out.println("remove element  ArrayList: " + lst3);


        // updating ARRAYLIST

        lst3.set(0,9); // it will update 0 element with 9
        System.out.println("updating element  ArrayList: " + lst3);


    }

}
