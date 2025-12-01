package linkedlist.searching;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static boolean isFound(Node head, int data){
        Node curr = head;
        while(curr.next!=null){
            if (curr.data == data){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(isFound(head,50));
    }
}
