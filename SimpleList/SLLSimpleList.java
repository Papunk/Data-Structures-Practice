package SimpleList;

import java.util.EnumMap;

public class SLLSimpleList<T> implements SimpleList<T> {

    private Node first;
    private Node last;
    private int numOfElems;

    public SLLSimpleList() {
        first = null;
        last = null;
        numOfElems = 0;
    }

    @Override
    public void add(T elem) {
        first = new Node(elem, first);
        if (numOfElems == 0) {
            last = first;
        }
        numOfElems++;
    }

    @Override
    public T getFirst() {
        return first.data;
    }

    @Override
    public T getLast() {
        return last.data;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T[] removeAll() {
        return null;
    }

    @Override
    public T remove(T elem) {
        return null;
    }

    @Override
    public T removeAllInstancesOf(T elem) {
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this(data, null);
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
