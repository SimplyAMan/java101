package com.tasks3.linkedlist;

/**
 * Created by ahuryn on 10.03.2017.
 */
public class LinkedListTest {

    static public void main(String [] argv){
        LinkedList linkedList = new LinkedList();
        System.out.println("-- add 10 --");
        linkedList.add(10);
        System.out.println("size - " + linkedList.size());
        System.out.println("-- add 20 --");
        linkedList.add(20);
        System.out.println("size - " + linkedList.size());
        System.out.println("node with 0 index - " + linkedList.get(0));
        System.out.println("node with 1 index - " + linkedList.get(1));
        System.out.println("node with 2 index - " + linkedList.get(2));
        System.out.println("size - " + linkedList.size());
        System.out.println("-- add 30 --");
        linkedList.add(30);
        System.out.println("size - " + linkedList.size());
        System.out.println("node with 0 index - " + linkedList.get(0));
        System.out.println("node with 1 index - " + linkedList.get(1));
        System.out.println("node with 2 index - " + linkedList.get(2));
        System.out.println("-- delete 0 element --");
        System.out.println(linkedList.delete(0));
        System.out.println("size - " + linkedList.size());
        System.out.println("node with 0 index - " + linkedList.get(0));
        System.out.println("node with 1 index - " + linkedList.get(1));
        System.out.println("node with 2 index - " + linkedList.get(2));
        System.out.println("-- delete 1 element --");
        System.out.println(linkedList.delete(1));
        System.out.println("size - " + linkedList.size());
        System.out.println("node with 0 index - " + linkedList.get(0));
        System.out.println("node with 1 index - " + linkedList.get(1));
        System.out.println("node with 2 index - " + linkedList.get(2));
        System.out.println("-- delete 1 element --");
        System.out.println(linkedList.delete(1));
        System.out.println("size - " + linkedList.size());
        System.out.println("node with 0 index - " + linkedList.get(0));
        System.out.println("node with 1 index - " + linkedList.get(1));
        System.out.println("node with 2 index - " + linkedList.get(2));

    }


}
