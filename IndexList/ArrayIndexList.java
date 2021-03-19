package IndexList;

import java.util.Arrays;

public class ArrayIndexList<T> implements IndexList<T> {

    private T[] list;
    private int numberOfElements;
    private static int DEFAULT_LENGTH = 25;

    public ArrayIndexList() {
        list = (T[]) new Object[DEFAULT_LENGTH];
        numberOfElements = 0;
    }

    @Override
    public T getElementAt(int index) {
        return (index < numberOfElements)? list[index] : null;
    }

    @Override
    public void append(T element) {
        if (numberOfElements == list.length) doubleCapacity();
        list[numberOfElements] = element;
        numberOfElements++;
    }

    @Override
    public void insert(T element, int atIndex) {
        if (atIndex < 0 || atIndex > numberOfElements) return;
        if (numberOfElements == list.length) doubleCapacity();

        for (int i = numberOfElements - 1; i > atIndex; i--) {
            list[i + 1] = list[i];
        }

        list[atIndex] = element;
        numberOfElements++;
    }

    @Override
    public T removeFirstInstanceOf(T element) {
        return null;
    }

    @Override
    public T removeAllInstancesOf(T element) {
        return null;
    }

    @Override
    public void clear() {
        list = (T[]) new Object[DEFAULT_LENGTH];
        numberOfElements = 0;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < numberOfElements; i++) {
            if (list[i].equals(element)) return true;
        }
        return false;
    }

    @Override
    public int getLength() {
        return numberOfElements;
    }

    private void doubleCapacity() {
        T[] newList = Arrays.copyOf(list, list.length * 2);
        list = newList;
    }

}
