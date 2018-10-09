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

    public void insert(int index, Object data) {
        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        Node previous = current.getPrevious();
        previous.setNext(newNode);
        newNode.setPrevious(previous);
        newNode.setNext(current);
        length++;
    }

    public void remove(int index) {
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        Node previous = current.getPrevious();
        Node next = current.getNext();
        previous.setNext(current.getNext());
        next.setPrevious(previous);
        length--;
    }

    public Object getHead() {
        return this.head.getData();
    }

    public Object getTail() {
        return this.tail.getData();
    }

    public int length() {
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current;

        if (head != null) {
            builder.append(" " + head.getData().toString());
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
                builder.append(" " + current.getData().toString());
            }
        }
        return builder.toString();
    }
}
