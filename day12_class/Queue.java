package day12_class;

public class Queue {

    int[] elements;
    int front;
    int rear;
    int size;

    Queue(int length) {
        elements = new int[length];

        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int value) {

        if (size == elements.length) {
            System.out.println("Queue is full");
            return;
        }

        elements[rear] = value;

        rear = (rear + 1) % elements.length;

        size++;
    }

    public void dequeue() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued: " + elements[front]);

        front = (front + 1) % elements.length;

        size--;
    }

    public void viewElements() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {

            System.out.print(
                elements[(front + i) % elements.length] + " "
            );
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.viewElements();

        queue.dequeue();

        queue.viewElements();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.viewElements();
    }
}