package Queue;

import java.util.EmptyStackException;

public class ArrayQueue<T> implements Queue<T> {

    private int first;
    int size;
    private T[] arr;
    private static final int DEFAULT_CAPACITY = 20;

    public ArrayQueue() {
        arr = (T[]) new Object[DEFAULT_CAPACITY + 1];
        first = 0;
        size = 0;
    }

    @Override
    public void enqueue(T e) {
        if (size == arr.length) doubleCapacity();
        arr[(first + size) % arr.length] = e;
        size++;
    }

    @Override
    public T dequeue() {
        T etr = getFirst();
        arr[first] = null;
        first = (first + 1) % arr.length;
        size--;
        return etr;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[first];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void doubleCapacity() {
            T[] newArr = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[(first + i) % arr.length];
                arr[(first + i) % arr.length] = null;
            }
            first = 0;
        arr = newArr;
        }
}
