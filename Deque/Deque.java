package Deque;

public interface Deque<T> {

    void addToBack(T e);
    void addToFront(T e);

    T getFront();
    T getBack();

    T removeFront();
    T removeBack();

}
