package linkedlist.basics;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static void main(String[] args){
        Node head = new Node(10);

        head.next = new Node(20);

        head.next.next = new Node(30);

        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
}
