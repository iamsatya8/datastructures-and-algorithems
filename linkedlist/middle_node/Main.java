package linkedlist.middle_node;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}
public class Main {

    public static int getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast  = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println("Middle node Value : "+getMiddle(head));
    }
}
