package LinkedList.Stack;

import javax.sound.sampled.SourceDataLine;

public class Stack {
    public static void main(String[] args) {
    StackUsingArray stack = new StackUsingArray();
    stack.push(10);
    stack.push(20);
    System.out.println(stack.size());
    System.out.println(stack.pop());
    }
}
