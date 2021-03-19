package Stack;

import Node.GenericNode;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private GenericNode<T> head;

    public LinkedStack() {
        head = null;
    }

    @Override
    public void push(T element) {
        head = new GenericNode(element, head);
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return head.data;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T etr = peek();
        head = head.next;
        return etr;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
