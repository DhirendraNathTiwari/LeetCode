package LinkedList;

import java.util.Scanner;

public class InserNewNode {
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static Node<Integer> insertNode(Node<Integer> head, int pos, int data){
        Node<Integer> newNode =  new Node<>(data);
        int currpos = 0;
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
            Node<Integer> temp = head;
            while(temp!=null && currpos < pos-1){
                temp=temp.next;
                currpos++;
            }
            if(temp==null) return head;
            
                newNode.next = temp.next;
                temp.next = newNode;
                return head;

    }
    public static Node<Integer> insertNodeR(Node<Integer> head, int pos, int data){
        if(head==null && pos > 0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode =  new Node<>(data);
            newNode.next = head;
            return newNode;
        }
        else{
            head.next =  insertNodeR(head.next, pos-1, data);
            return head;
        }
    }
    public static Node<Integer> deleteR(Node<Integer> head, int pos){
        if(head==null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        else{
            head.next = deleteR(head.next, pos-1);
            return head;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(10, new Node<>(20, new Node<>(30, new Node<>(40))));
        print(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos: ");
        int pos = sc.nextInt();
        // System.out.println("Enter data: ");
        // int data = sc.nextInt();
        // Node<Integer> Newhead = insertNodeR(head, pos, data);
        Node<Integer> Head = deleteR(head, pos);
        print(Head);
    }
}
