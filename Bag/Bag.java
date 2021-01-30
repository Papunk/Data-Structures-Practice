package Bag;


public interface Bag<T> {

    int getCurrentSize();
    boolean isEmpty();
    boolean contains();
    boolean hasDuplicates();
    void add(T newEntry);
    T remove();
    T remove(T elem);
    void removeAll();
}
