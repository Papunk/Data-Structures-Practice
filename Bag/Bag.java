package Bag;


public interface Bag<T> {

    int getCurrentSize();
    boolean isEmpty();
    boolean contains(T elem);
    boolean hasDuplicates();
    void add(T newEntry);
    T remove();
    T remove(T elem);
    int getFrecuencyOf(T elem);
    void removeAll();
    T[] toArray();
}
