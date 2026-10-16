package Stacks;

public class LinkedListStack {
    private  Node top;
    private class Node {
        int data;
        Node next;
    }

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        System.out.println(data + " added to the LinkedListStack.");
    }

    public int pop(){
     if (top == null){
         System.out.println("Stack is empty! Can't pop.");
         return -1;
     }else {
         int poppedValue = top.data;
         top = top.next;
         System.out.println("Popped element: " + poppedValue);
         return poppedValue;
     }
    }

    public int peek(){
        if (top == null) {
            System.out.println("Stack is empty! No elements to peek.");
            return -1;
        }else{
            int peekValue = top.data;
            System.out.println("Peek element: " + peekValue);
            return peekValue;
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
    }

}
