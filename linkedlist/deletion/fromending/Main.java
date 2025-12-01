package linkedlist.deletion.fromending;

import java.net.InetAddress;

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

    public static Node deleteAtEnd(Node head){
        if (head==null){
            return null;
        }
        Node temp = head;

        if (temp.next==null){
            return null;
        }

        while (temp.next.next!=null){
            temp =temp.next;
        }
        Node delete = temp.next;

        temp.next=null;
        delete = null;

        return head;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printLL(head);
        head = deleteAtEnd(head);
        printLL(head);
    }
}
