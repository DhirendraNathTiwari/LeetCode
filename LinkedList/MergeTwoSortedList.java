package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedList {
    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currNode =  new Node<>(data);
            if(head == null){
                head = currNode;
                tail = currNode;
                
            }
            else{
                tail.next = currNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> mergeList(Node<Integer> head1, Node<Integer> head2){
        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> newHead = null, newTail = null;
        if(t1.data < t2.data){
            newHead = t1;
            newTail = t1;
            t1 = t1.next;
        }
        else{
            newHead = t2;
            newTail = t2;
            t2 = t2.next;
        }
        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                newTail.next = t1;
                newTail = newTail.next;
                t1 = t1.next;
            }
            else{
                newTail.next = t2;
                newTail = newTail.next;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            newTail.next = t1;
        }
        else
        newTail.next = t2;
        return newHead;
    }
    public static void main(String[] args) {
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        Node<Integer> head = mergeList(head1, head2);
        print(head);
    }
}
