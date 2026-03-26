package org.example;

import org.example.LinkedList.DoublyLinkedList;
import org.example.LinkedList.LinkedList;
import org.example.model.DoubleLinkedList;

import java.util.HashMap;

public class Cache {
    HashMap<String, DoubleLinkedList> map = new HashMap<>();
    DoublyLinkedList ptr;
    int size = 0;
    int targetsize;


    public Cache(int target){
        targetsize=target;
        ptr = new DoublyLinkedList();
    }


    public void add(String key, String value){
        System.out.println("GOING TO ADD KEY" + key);
        System.out.println("before addition");
        ptr.printlist();
        if(!map.containsKey(key) && size <= targetsize){
            DoubleLinkedList newobj = new DoubleLinkedList(key, value, null, null);
            ptr.attachfirst(newobj);
            map.put(key, newobj);
            size++;
        }
        else if(map.containsKey(key)){
            DoubleLinkedList existobj = map.get(key);
            if(existobj.value!=value){
                existobj.value=value;
            }

            ptr.attachfirst(existobj);
        }
        else if (size >= targetsize) {
            String evictedkey = ptr.evict();
            map.remove(evictedkey);
            System.out.println("eviction"  + evictedkey);
            DoubleLinkedList newobj = new DoubleLinkedList(key, value, null, null);
            ptr.attachfirst(newobj);
            map.put(key, newobj);
            size++;
        }

        System.out.println("after addition" );
        ptr.printlist();
        System.out.println("#########" );

    }

    public String get(String key){
        if(map.containsKey(key)){
            DoubleLinkedList existobj = map.get(key);
            ptr.remove(existobj);
            ptr.attachfirst(existobj);
            return existobj.value;
        }
        System.out.println("key not in cache" + key);
        return "";

    }

}
