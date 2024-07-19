package Queue;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) rear = -1;
        queueArray[++rear] = value;
        nItems++;
        System.out.print("Enqueue: ");
        printQueue();
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) front = 0;
        nItems--;
        System.out.print("Dequeue: ");
        printQueue();
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void printQueue() {
        for (int i = 0; i < nItems; i++) {
            int index = (front + i) % maxSize;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
    }
}

//Output:
// Enqueue: 1 
// Enqueue: 1 2 
// Enqueue: 1 2 3 
// Dequeue: 2 3 
// Enqueue: 2 3 4 
// Enqueue: 2 3 4 5 
// Dequeue: 3 4 5 
// Dequeue: 4 5 
// Enqueue: 4 5 6 
// Enqueue: 4 5 6 7 
// Enqueue: 4 5 6 7 8 