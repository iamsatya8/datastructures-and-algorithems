package linkedlist.reverse;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}
public class Main {

    public static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data);
            if (head.next!=null){
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printLL(head);
        head = reverseLL(head);
        printLL(head);

    }
}
