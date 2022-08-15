package com.example.linkedList;

import java.util.Arrays;
import java.util.Collections;

public class LinkedListCreateMainTest {
    public static void main(String[] args) {
        int [] values = {2,4,7,6,5,1};
        Node head = createLinkedListByArray(values);
        traverseGivenLikedList(head);

    }

    //create linked list by given array

    public static Node createLinkedListByArray(int [] values){
       if (values == null || values.length<1){
           System.out.println("invalid in put to create linked list");
           return null;
       }
       Node head = null;
        for (int value : values) {
            if (head == null){
                head = new  Node(value,null);
            }else {
                Node temp = head;
                while (temp.getNext()!=null){
                    temp = temp.getNext();
                }
                temp.next= new Node(value,null);
            }
        }
        return head;
    }

    public static void traverseGivenLikedList(Node head){
        if (head == null){
            System.out.println("Empty linked list");
        }else {
            Node temp = head;
            do {
                int value = temp.getValue();
                temp = temp.getNext();
                System.out.print(value);
                System.out.print(" ");
            }while (temp!=null);

        }
    }

    public static class Node {
       private int value;
       private Node next;

       public Node(int value,Node next){
           this.next = next;
           this.value =value;
       }
       public int getValue(){
           return value;
       }
       public Node getNext()
       {
           return next;
       }

    }
}
