package SimpleList;

import java.util.Arrays;

public class ArraySimpleList<T> implements SimpleList<T> {

    private T[] list;
    private int numOfElems;

    private static final int DEFAULT_CAPACITY = 25;

    public ArraySimpleList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        numOfElems = 0;
    }

    @Override
    public void add(T elem) {
        if (numOfElems == list.length) {
            list = Arrays.copyOf(list, numOfElems * 2);
        }
        list[numOfElems] = elem;
        numOfElems++;
    }

    @Override
    public T getFirst() {
        return list[0];
    }

    @Override
    public T getLast() {
        return list[numOfElems];
    }

    @Override
    public T removeFirst() {
        T first = list[0];
        if (first == null) return null; // avoiding an unnecessary iteration
        for (int i = 0; i < numOfElems; i++) {
            if (i == numOfElems - 1) list[i] = null;
            else list[i] = list[i + 1];
        }
        numOfElems--;
        return first;
    }

    @Override
    public T removeLast() {
        T last = list[numOfElems];
        list[numOfElems] = null;
        numOfElems--;
        return last;
    }

    @Override
    public T[] removeAll() {
        T[] copy = Arrays.copyOf(list, numOfElems);
        list = (T[]) new Object[DEFAULT_CAPACITY];
        return copy;
    }

    @Override
    public T remove(T elem) {
        boolean found = false;
        T instance = null;
        for (int i = 0; i < numOfElems; i++) {
            if (list[i].equals(elem)) {
                found = true;
                instance = list[i];
            }
            if (found) {
                if (i == numOfElems - 1) list[i] = null;
                else list[i] = list[i + 1];
            }
        }
        return instance;
    }

    @Override
    public T removeAllInstancesOf(T elem) {
        boolean found = false;
        T instance = null;
        while (true) {
            instance = remove(elem);
            if (instance != null) found = true;
            else break;
        }
        return found? elem : null;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(list, numOfElems);
    }
}
