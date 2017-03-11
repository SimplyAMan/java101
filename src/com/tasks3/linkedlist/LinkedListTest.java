package com.tasks3.linkedlist;

public class LinkedListTest {

    private LinkedList testAdd(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        return linkedList;
    }
    private void printList(LinkedList linkedList){
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println("element " + i + " - " + linkedList.get(i));
        }
    }

    static public void main(String [] argv){
        LinkedListTest test = new LinkedListTest();

        System.out.println("------------------------------------------------");
        System.out.println("----- Test add -----");
        System.out.println("------------------------------------------------");
        LinkedList linkedList = test.testAdd();
        System.out.println("Expected: size = 6, real: " + linkedList.size());
        test.printList(linkedList);

        System.out.println("------------------------------------------------");
        System.out.println("----- Test delete element with index 0 -----");
        System.out.println("------------------------------------------------");
        System.out.println("Expected: true, real: " + linkedList.delete(0));
        System.out.println("Expected: size = 5, real: " + linkedList.size());
        System.out.println("Expected: element start with 2, real: ");
        test.printList(linkedList);

        System.out.println("------------------------------------------------");
        System.out.println("----- Test delete element with index -1 -----");
        System.out.println("------------------------------------------------");
        System.out.println("Expected: false, real: " + linkedList.delete(-1));
        System.out.println("Expected: size = 5, real: " + linkedList.size());
        System.out.println("Expected: list unchanged, element start with 2, real: ");
        test.printList(linkedList);

        System.out.println("------------------------------------------------");
        System.out.println("----- Test delete element with index 6 -----");
        System.out.println("------------------------------------------------");
        System.out.println("Expected: false, real: " + linkedList.delete(-1));
        System.out.println("Expected: size = 5, real: " + linkedList.size());
        System.out.println("Expected: list unchanged, element start with 2, real: ");
        test.printList(linkedList);

        System.out.println("------------------------------------------------");
        System.out.println("----- Test delete element with index 3 -----");
        System.out.println("------------------------------------------------");
        System.out.println("Expected: true, real: " + linkedList.delete(3));
        System.out.println("Expected: size = 4, real: " + linkedList.size());
        System.out.println("Expected: elements start with 2, element with index 3 = 6, real: ");
        test.printList(linkedList);
    }


}
