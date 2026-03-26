package org.example.model;

import org.example.LinkedList.DoublyLinkedList;

public class DoubleLinkedList {

    public String key;
    public String value;
    public DoubleLinkedList prev;
    public DoubleLinkedList next;


    public DoubleLinkedList(String k, String v, DoubleLinkedList p, DoubleLinkedList n){
        key=k;
        value = v;
        prev = null;
        next = null;
    }

}
