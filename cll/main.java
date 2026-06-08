package cll;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Cll {
    Node tail;
    int n = 0;

    Cll() {
        tail = null;
    }

    void insertBegin(int val) {
        Node newNode = new Node(val);
        n++;

        if (tail == null) {
            tail = newNode;
            tail.next = newNode;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
    }

    void insertLast(int val) {
        Node newNode = new Node(val);
        n++;
        if (tail == null) {
            tail = newNode;
            tail.next = newNode;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    void display() {
        Node temp = tail.next;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
    }

    void insertMid(int val, int idx) {
        if (idx == 0) {
            insertBegin(val);
            return;
        }
        if (tail == null || idx > n) {
            System.out.println("Invalid");
            return;

        }

        Node temp = tail;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteKey(int key) {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = tail;
        if (tail.val == key) {
            do {
                temp = temp.next;
            } while (temp.next != tail);
            temp.next = tail.next;
            tail = temp;
            n--;
        }

        while (temp.next != tail && temp.next.val != key) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            System.out.println("No Data found");
            return;
        }

        temp.next = temp.next.next;
        n--;
    }

    void deleteIndex(int idx) {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        }

        if (idx < 0 || idx >= n) {
            System.out.println("Invalid Index");
            return;
        }

        if (idx == 0) {
            if (tail.next == tail) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
            n--;
            return;
        }

        if (idx == n - 1) {
            Node temp = tail.next;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = tail.next;
            tail = temp;
            n--;
            return;
        }

        Node temp = tail.next;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        n--;
    }

    void deleteFirst(){
        if(tail == null ) {
            System.out.println("No list");
            return;
        }
        tail.next = tail.next.next;
        n--;
    }

    void deleteLast(){
        if(tail == null) {
            System.out.println("No List");
            return;
        }
        Node temp = tail;
        do{
            temp = temp.next;
        }while(temp.next != tail);

        temp.next = tail.next;
        tail = temp;
        n--;
    }
}

class Main {
    public static void main(String[] args) {
        Cll c = new Cll();
        c.insertBegin(1);
        c.insertLast(2);
        c.insertLast(3);
        c.insertMid(4, 1);
        c.display();
    }
}
