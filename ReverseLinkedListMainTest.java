package com.example.linkedlist.reverse;

public class ReverseLinkedListMainTest {
    public static void main(String[] args) {
          int [] values = {3,5,4,7,8,2};
          Node head = createLinkedList(values);
          printLinkedListNode(head);
          Node reverseHead = reverseLinkedList(head);
          printLinkedListNode(reverseHead);
    }

    public static Node createLinkedList(int [] values){
        Node head = null;
        if (values ==null || values.length<1){
           return head;
        }else {
            for (int i =0;i<values.length;i++)
            if (head == null){
                head = new Node();
                head.data = values[i];
                head.next = null;
            }else {
                Node temp = head;
                while (temp.next!=null){
                    temp = temp.next;
                }
                Node node = new Node();
                node.data = values[i];
                node.next = null;
                temp.next= node;

            }
        }

        return head;
    }

    public static void printLinkedListNode(Node head){
        if (head ==null){
            System.out.println("list empty");
        }else {
            while (head!=null){
                System.out.print(head.data+" ");
                head = head.next;
            }
        }
    }

    public static Node reverseLinkedList(Node head){
        System.out.println("reverse Linked list start");
        if (head == null || head.next ==null){
            return head;
        }else {
            Node next = head.next;
            Node current = head;
            current.next = null;
            Node prv = null;
            while (next!=null){
                prv = current;
                current = next;
                next = next.next;
                current.next = prv;

            }
            head = current;
        }

        return head;
    }

    


    public static class Node{
        public int data;
        public Node next;
    }
}
