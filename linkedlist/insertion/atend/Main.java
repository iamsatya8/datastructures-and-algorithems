package linkedlist.insertion.atend;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if (head==null){
            return newNode;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

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

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printLL(head);

        int x = 50;
        head =  insertAtEnd(head,x);

        printLL(head);
    }
}
