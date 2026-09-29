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

        ArrayList<Integer> lst3 = new ArrayList<>(12);
    lst3.add(2); // will ad element at the end
        lst3.add(1,3); // will add element at index 1 and move element accordingly

    }

}
