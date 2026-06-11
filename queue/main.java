package queue;

import java.util.Deque;

class Node {
    int val;
    Node next, prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class Dequeue {
    Node front, rear;
    int count = 0;

    Dequeue() {
        front = rear = null;
    }

    void addFront(int data) {
        Node newnode = new Node(data);
        count++;

        if (front == null && rear == null) {
            front = rear = newnode;
            return;
        }
        newnode.next = front;
        front.prev = newnode;
        front = newnode;

    }

    void addLast(int data) {
        Node newnode = new Node(data);
        count++;

        if (front == null && rear == null) {
            front = rear = newnode;
            return;
        }

        newnode.prev = rear;
        rear.next = newnode;
        rear = newnode;
    }

    int removeFront() {
        if (rear == null && front == null) {
            throw new IndexOutOfBoundsException("Empty");
        }

        int data = front.val;
        front = front.next;
        front.prev = null;
        count--;

        return data;

    }

    int removeLast() {
        if (rear == null && front == null) {
            throw new IndexOutOfBoundsException("Empty");
        }

        int data = rear.val;

        if (rear.prev == null) {
            front = rear = null;
        } else {

            rear = rear.prev;
            rear.next = null;
        }

        count--;
        return data;
    }


    void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }

}

public class main {
    public static void main(String[] args) {
        Dequeue d=new Dequeue();
        d.addFront(1);
        d.addFront(2);
        d.addLast(3);
        d.addLast(4);
        d.addLast(3);
        d.addLast(5);
        d.display();
        d.removeFront();
        d.display();
        d.removeLast();
        d.display();
    }
}
