package LinkedList.Stack;

import java.util.Scanner;

public class StackUsingArray {
    private int data[];
    private int topindex;

    public StackUsingArray(){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        data = new int[10];
        topindex = -1;
    }
    public int size(){
        return topindex+1;
    }
    public boolean isEmpty(){
        return topindex == -1;
    }
    public void push(int elem){
        data[++topindex] = elem;
    }
    public int top(){
        return data[topindex];
    }
    public int pop(){
        return data[topindex--];
    }

}
