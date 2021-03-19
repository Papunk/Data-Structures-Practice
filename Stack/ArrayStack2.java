package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack2<T> implements Stack<T> {

    private T[] list;
    private int size;
    private static final int INITIAL_SIZE = 20;

    public ArrayStack2() {
        list = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void push(T element) {
        if (size >= list.length) doubleCapacity();
        if (!isEmpty()) {
            for (int i = list.length - size; i < list.length; i++) {
                list[i - 1] = list[i];
            }
        }
        list[list.length - 1] = element;
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list[list.length - 1];
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T etr = list[list.length - 1];
        for (int i = 0; i < size; i++) {
            list[list.length - 1 - i] = list[list.length - 2 - i];
        }
        size--;
        return etr;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        list = (T[]) new Object[INITIAL_SIZE];
    }

    private void doubleCapacity() {
        T[] newList = (T[]) new Object[list.length * 2];
        for (int i = 1; i <= size; i++) {
            newList[newList.length - i] = list[list.length - i];
        }
        list = newList;
    }

    public T[] toArray() {
        return Arrays.copyOfRange(list, list.length - size, list.length);
    }

}
