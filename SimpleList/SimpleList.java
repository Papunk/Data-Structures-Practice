package SimpleList;

public interface SimpleList<T> {

    void add();

    T getFirst();
    T getLast();

    T removeFirst();
    T removeLast();
    T[] removeAll();
    T remove(T elem);
    T removeAll(T elem);

    T[] toArray();
}
