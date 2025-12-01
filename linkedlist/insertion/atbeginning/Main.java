package linkedlist.insertion.atbeginning;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static Node insertAtBeginning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.print(head.data);
            if(head.next!=null){
               System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printLinkedList(head);

        int x = 5;
        head = insertAtBeginning(head,x);

        printLinkedList(head);
    }
}
