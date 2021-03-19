package Stack;

import Node.GenericNode;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private GenericNode<T> head;
    int size;

    public LinkedStack() {
        head = null;
        size = 0;
    }

    @Override
    public void push(T element) {
        head = new GenericNode(element, head);
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return head.data;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T etr = head.data;
        head = head.next;
        size--;
        return etr;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
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
