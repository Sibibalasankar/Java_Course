package priorityQueue;

class prique {

    int[] heap;
    int capacity;
    int size;

    prique(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int leftchild(int i) {
        return 2 * i + 1;
    }

    int rightchild(int i) {
        return 2 * i + 2;
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(int data) {

        if (size == capacity) {
            System.out.println("Heap is Full");
            return;
        }

        heap[size] = data;
        int curr = size;
        size++;

        // Heapify Up
        while (curr > 0 && heap[curr] < heap[parent(curr)]) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    int remove() {

        if (size <= 0) {
            throw new RuntimeException("Heap is Empty");
        }

        int min = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return min;
    }

    void heapifyDown(int i) {

        int smallest = i;

        int left = leftchild(i);
        int right = rightchild(i);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    int peek() {
        if (size == 0) {
            throw new RuntimeException("Heap is Empty");
        }
        return heap[0];
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class main {

    public static void main(String[] args) {

        prique pq = new prique(10);

        pq.insert(10);
        pq.insert(5);
        pq.insert(20);
        pq.insert(2);

        System.out.println("Heap:");
        pq.display();

        System.out.println("Peek: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        pq.display();

        System.out.println("Removed: " + pq.remove());
        pq.display();
    }
}