package com.codecool.doublyLinkedList;

public class DoublyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public void add(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = head;
        }
        else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        length++;
    }

    public Object getHead() {
        return this.head.getData();
    }
}
