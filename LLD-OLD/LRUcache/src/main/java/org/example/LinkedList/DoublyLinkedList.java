package org.example.LinkedList;

import org.example.model.DoubleLinkedList;

public class DoublyLinkedList implements LinkedList{

    public DoubleLinkedList head = new DoubleLinkedList("-10000", "-100000", null, null);
    public DoubleLinkedList tail = new DoubleLinkedList("-10000", "-100000", null, null);


    public DoublyLinkedList(){
        head.next = tail;
        tail.prev = head;
    }


    public void printlist(){
        DoubleLinkedList temphead = head;

        while(temphead != null){
            System.out.print(temphead.key + "->");
            temphead = temphead.next;
        }
    }

    public void remove(DoubleLinkedList obj){
        if(obj!=null){
            obj.prev.next = obj.next;
            obj.next.prev = obj.prev;
        }
    }

    public String evict(){

        DoubleLinkedList obj = tail.prev;
        remove(obj);
        return obj.key;

    }





    public DoubleLinkedList attachfirst(DoubleLinkedList obj){
        obj.next = head.next;
        head.next.prev = obj;
        obj.prev = head;
        head.next = obj;
        return obj;
    }
}
