package com.company.MyList;

public class MyList {
    public Node head;

    public MyList(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
