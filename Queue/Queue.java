package Queue;

public interface Queue<T> {
    void enqueue(T e);
    T dequeue();
    T getFirst();
    boolean isEmpty();
}
