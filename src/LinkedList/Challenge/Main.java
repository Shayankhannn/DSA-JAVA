package LinkedList.Challenge;

public class Main {
    public static void main(String[] args) {
        LinkedList waitlist =  new LinkedList();
        waitlist.addCustomer("John","table for 6");
        waitlist.addCustomer("Ali","table for 1");
        waitlist.addCustomer("Bravo","table for 4");
        waitlist.addVipCustomer("brick","table for 2");

        waitlist.printWaitList();
    }
}
