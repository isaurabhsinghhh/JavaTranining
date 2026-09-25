package day12_class;

public class CircularQueue {
    int front;
    int rear;
    int count;
    int[] queue;
    int size;

    CircularQueue(int size) {
        front = 0;
        rear = -1;
        count = 0;
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int data) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % size;
        queue[rear] = data;
        count++;
    }

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        front = (front + 1) % size;
        count--;
    }

    void display() {
        if (count == 0) {
            System.out.println("The queue is empty");
            return;
        }

        int index = front;

        for (int i = 0; i < count; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % size;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("After dequeue:");
        queue.display();

        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("After adding:");
        queue.display();
    }
}