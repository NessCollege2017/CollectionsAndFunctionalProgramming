package edu.tomer;

import java.util.Queue;

/**
 * Created by Android2017 on 5/26/2017.
 */
public class MyStringLinkedList {
    int count;
    Node head;

    public MyStringLinkedList() {
        count = 0;
        head = null;
    }

    //add(String data)
    public void add(String data){
        Node n = new Node(data);
        if (count == 0){
            head = n;
        }else {
            head.next = n;
        }
        count++;
    }

    public String get(){
        //
        return null;
    }

    class Node{
        public Node(String data) {
            this.data = data;
        }
        Node next;
        String data;
    }
}
