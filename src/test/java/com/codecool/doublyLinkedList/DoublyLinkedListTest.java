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

    private DoublyLinkedList createDoublyLinkedListWithAlphabet() {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 65; i <= 90; i++) {
            list.add((char)i);
        }
        return list;
    }
}
