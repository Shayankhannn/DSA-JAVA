package Stacks;

public class ArrayStack {
    private int[] stack;
    private int top;

    public ArrayStack(int size){
        stack = new int[size];
        top = -1;
    }

    public void push(int value){
        if (top == stack.length - 1){
            System.out.println("Stack is full! Can't push.");
        }else {
            stack[++top] = value;
            System.out.println(value + " added to the ArrayStack.");
        }
    }

public int pop(){
        if(top == -1){
            System.out.println("Stack is empty! Can't pop.");
            return -1;
        }else {
            int poppedValue = stack[top--];
            System.out.println("Popped element: " + poppedValue);
            return poppedValue;
        }
}

    public int peek(){
        if (top == -1) {
            System.out.println("Stack is empty! No elements to peek.");
            return -1;
        }else{
            int peekValue = stack[top];
            System.out.println("Peek element: " + peekValue);
            return peekValue;
        }
    }


public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
}


}

