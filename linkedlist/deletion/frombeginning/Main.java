package linkedlist.deletion.frombeginning;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
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

    public static Node deleteAtBegining(Node head){
        if(head==null){
          return null;
        }
        if (head.next == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public static void main(String[] args){
//        Node head =null;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printLL(head);
        head = deleteAtBegining(head);
        printLL(head);
    }
}
