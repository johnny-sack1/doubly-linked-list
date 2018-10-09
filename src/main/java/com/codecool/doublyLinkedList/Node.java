package com.codecool.doublyLinkedList;

public class Node {
    Node next;
    Node previous;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return getData().toString();
    }
}
