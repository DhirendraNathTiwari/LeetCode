package LinkedList;

import java.util.Scanner;

public class TakeInput {
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
    }
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data!=-1){
            Node<Integer> curr = new Node<Integer>(data);
            if(head==null){
                head = curr;
                tail = curr;
            }
            else{
                // Node<Integer> temp = head;
                // while(temp.next!=null){
                //     temp=temp.next;
                // }
                // temp.next=curr;
                tail.next = curr;
                tail = tail.next;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);
    }
}
