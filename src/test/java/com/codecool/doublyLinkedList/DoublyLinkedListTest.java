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

    @Test
    void insertTest() {
        DoublyLinkedList list = createDoublyLinkedListWithAlphabet();
        list.insert(5, 'A');
        String result = " A B C D E A F G H I J K L M N O P Q R S T U V W X Y Z";
        assertEquals(result, list.toString());
    }

    private DoublyLinkedList createDoublyLinkedListWithAlphabet() {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 65; i <= 90; i++) {
            list.add((char)i);
        }
        return list;
    }
}
