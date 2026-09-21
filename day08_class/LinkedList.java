package day08_class;

//This is pseudo code just for understanding.

import java.util.*;

class LinkedList {
    static Node head;
    public static void main(String[] args) {
        Node newNode= new Node(10);
        if(head==null){
            head=newNode;
        }

        Node temp = head;
        Node newNode1 = new Node(20);

        while (temp.next!=null) {
            temp=temp.next;
        }

        temp.next=newNode1;
        Node temp1= head;
        while (temp1!=null) {
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }

    }
}
