package com.tasks3.linkedlist;

public class LinkedList {
    private int size;
    private Node header;
    private Node tail;

    public LinkedList() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node newNode = new Node();
        newNode.setData(data);
        if(tail == null) {
            header = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        if(index<size) {
            Node node = header;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            return node.getData();
        }
        else
            return null;
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        if(index<size && size != 0) {
            if (index == 0) {
//                header = node.getNext();
                header = header.getNext();
            }
            else {
                Node node = header;
                for (int i = 1; i < index-1; i++) {
                    node = node.getNext();
                }
            }
            size--;
            return true;
        }
            else
                    return false;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        return size;
        //PUT YOUR CODE HERE
    }
}
