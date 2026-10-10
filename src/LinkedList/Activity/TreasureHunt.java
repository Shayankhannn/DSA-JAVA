package LinkedList.Activity;

import java.util.LinkedList;

public class TreasureHunt {
    public static void main(String[] args){

        LinkedList<String> clues= new LinkedList<>();
        clues.add("Check inside the mailbox");
        clues.add("Go to the fountain in the park");
        clues.add("look for the oak tree");

        System.out.println(clues);
        clues.set(2,"Look behind the old Oak tree");
        System.out.println("updated clues :  " +clues);

        String firstClue = clues.get(0);
        String secondClue = clues.get(1);
        String thirdClue = clues.get(2);
        System.out.println("First clue: " + firstClue);
        System.out.println("second clue: " + secondClue);
        System.out.println("third clue: " + thirdClue);

        clues.removeLast();
        System.out.println(clues);

        clues.remove(1);

    }
}
