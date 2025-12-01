package linkedlist.deletion.fromposition;

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

    public static Node deleteFromPosition(Node head, int position){
        Node temp = head;
        if (position==1){
            head = head.next;
            return head;
        }

        Node prev = null;
        for(int i=1;i<position;i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printLL(head);
        head = deleteFromPosition(head, 3);
        printLL(head);

    }
}
