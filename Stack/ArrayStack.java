package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {

    private T[] list;
    private int size;
    private static final int INITIAL_SIZE = 20;

    public ArrayStack() {
        list = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void push(T element) {
        if (size >= list.length) doubleCapacity();
        list[size] = element;
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list[size];
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T etr = list[size - 1];
        list[size - 1] = null;
        size--;
        return etr;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }

    private void doubleCapacity() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[i] = pop();
        }
        for (T e: arr) {
            push(e);
        }

        return arr;
    }

}
