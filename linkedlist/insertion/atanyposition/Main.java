package linkedlist.insertion.atanyposition;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static Node insertAtPosition(Node head, int pos, int  data){
        if (pos<1){
            return head;
        }

        if (pos==1){
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for(int i=1;i<pos;i++){
            curr = curr.next;
        }

        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;

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

        int position = 2;
        head = insertAtPosition(head, position, 5);

        printLL(head);

    }
}
