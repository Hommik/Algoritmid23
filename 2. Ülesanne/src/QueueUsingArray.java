import java.util.NoSuchElementException;


public class QueueUsingArray {
    private Object[] array;
    private int front;
    private int rear;
    private int capacity;

    private String name;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(Object item) {
        if ((rear + 1) % capacity == front) {
            throw new IllegalStateException("Järjekord on täis");
        }
        array[rear] = item;
        rear = (rear + 1) % capacity;

    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Järjekord on tühi");
        }
        Object item = array[front];
        array[front] = null;
        front = (front + 1) % capacity;
        return item;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Järjekord on tühi");
        }
        return array[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public int size() {
        return (rear - front + capacity) % capacity;
    }

}








