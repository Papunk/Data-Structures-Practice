package Queue;

import Node.GenericNode;
import java.util.EmptyStackException;

public class LinkedQueue<T> implements Queue<T> {

    private GenericNode<T> first;
    private GenericNode<T> last;

    public LinkedQueue() {
        first = last = null;
    }

    @Override
    public void enqueue(T e) {
        GenericNode n = new GenericNode(e);
        if (isEmpty()) first = n;
        else last.next = n;
        last = n;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new EmptyStackException();
        T etr = first.data;
        first = first.next;
        if (first == null) last = null;
        return etr;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) throw new EmptyStackException();
        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
