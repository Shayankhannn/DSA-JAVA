package LinkedList.Challenge;

public class LinkedList {
Node head;
LinkedList(){
    this.head=null;
}


    void addCustomer(String name,String details){
    Node newNode = new Node(name,details);
    if (head==null){
        head = newNode;
    }
    else {
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    }

    void removeCustomer(String customerName){
    if (head == null) return;
    if (head.name.equals(customerName)){
        head = head.next;
        return;
    }

    Node current = head;

    while (current.next !=null && !current.next.name.equals(customerName)){
        current = current.next;
    }
    if (current.next !=null) current.next = current.next.next;

    }

    void addVipCustomer(String  name,String details){
    Node newNode = new Node(name,details);
    if (head==null){
        head=newNode;
    }
    else {
//        Node current = head;
//        head =  newNode;
//        head.next = current;

    newNode.next = head;
    head = newNode;

    }
    }

    void printWaitList(){
    for (Node current = head; current != null; current = current.next){
        System.out.print("Name : "+current.name+" Details : "+current.details + "\n");
    }
    }

    void updateCustomer(String customerName,String newDetails){
        Node current = head;
       while (current != null){
           if (current.name.equals(customerName)){
               current.details = newDetails;
           }
           current = current.next;

       }
    }

}
