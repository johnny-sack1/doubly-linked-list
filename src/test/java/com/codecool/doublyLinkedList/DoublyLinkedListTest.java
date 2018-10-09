package com.codecool.doublyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    @Test
    void headTest() {
        DoublyLinkedList list = createDoublyLinkedListWithAlphabet();
        char result = 'A';
        assertEquals(result, list.getHead());
    }

    @Test
    void tailTest() {
        DoublyLinkedList list = createDoublyLinkedListWithAlphabet();
        char result = 'Z';
        assertEquals(result, list.getTail());
    }

    @Test
    void lengthTest() {
        DoublyLinkedList list = createDoublyLinkedListWithAlphabet();
        int result = 26;
        assertEquals(result, list.length());
    }

    private DoublyLinkedList createDoublyLinkedListWithAlphabet() {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 65; i <= 90; i++) {
            list.add((char)i);
        }
        return list;
    }
}
