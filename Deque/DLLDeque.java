package Deque;

import java.util.EmptyStackException;

public class DLLDeque<T> implements  Deque<T> {

    DLNode<T> first;
    DLNode<T> last;

    public DLLDeque() {
        first = null;
        last = null;
    }


    @Override
    public void addToBack(T e) {
        DLNode newNode = new DLNode(last, null, e);
        if (isEmpty()) first = newNode;
        else last.next = newNode;

        last = newNode;
    }

    @Override
    public void addToFront(T e) {
        DLNode newNode = new DLNode(null, first, e);
        if (isEmpty()) last = newNode;
        else first.next = newNode;

        first = newNode;
    }

    @Override
    public T getFront() {
        if (isEmpty()) throw new EmptyStackException();
        return first.data;
    }

    @Override
    public T getBack() {
        if (isEmpty()) throw new EmptyStackException();
        return last.data;
    }

    @Override
    public T removeFront() {
        T front = getFront();
        first = first.next;
        if (first == null)
            last = null;
        else first.prev = null;
        return front;
    }

    @Override
    public T removeBack() {
        T back = getBack();
        last = last.prev;
        if (last == null)
            first = null;
        else last.next = null;

        return back;
    }

    public boolean isEmpty() {
        return first != null;
    }

    private class DLNode<T> {
        public DLNode prev;
        public DLNode next;
        public T data;

        public DLNode(DLNode prev, DLNode next, T data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }

}
