package linkedlist.updation.using_list;

import java.util.List;
import java.util.ArrayList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main {

    public static int countNodes(Node head){
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void linkedListToList(Node head, List<Integer> list){
        Node curr = head;

        for(int i=0; i<list.size();i++){
            list.set(i,curr.data);
            curr = curr.next;
        }
    }

    public static void listToLinkedList(List<Integer> list, Node head){
        Node curr = head;
        for(int i=0;i<list.size();++i){
            curr.data = list.get(i);
            curr = curr.next;
        }
    }

    public static void modifyList(List<Integer> list){
        for(int i=1;i<list.size()/2;++i){
            int x = list.get(i);
            list.set(i,list.get(list.size()-i-1)-x);
            list.set(list.size()-i-1,x);
        }
    }

    public static Node modifyTheList(Node head){
        if(head.next==null) return null;

        int n = countNodes(head);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(0);
        }

        linkedListToList(head, list);

        modifyList(list);

        listToLinkedList(list, head);

        return head;
    }

    public static void printList(Node node){
        Node curr = node;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
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
