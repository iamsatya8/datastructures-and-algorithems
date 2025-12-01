package linkedlist.updation.using_reverse;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static Node reverse(Node head){
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

    public static Node modifyTheList(Node head){

        if(head.next==null) return head;

        Node slow = head;
        Node fast = head;
        Node mid;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        mid  = slow;

        Node reversedList = mid.next;

        mid.next = null;

        reversedList = reverse(reversedList);

        Node curr1 = head;
        Node curr2 = reversedList;

        while(curr2!=null){
            int x = curr1.data;
            curr1.data = curr2.data - x;
            curr2.data = x;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        mid.next = reverse(reversedList);
        return head;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        head = modifyTheList(head);

        printList(head);
    }
}
