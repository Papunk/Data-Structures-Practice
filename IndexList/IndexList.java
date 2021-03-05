package IndexList;

public interface IndexList<T> {
    T getElementAt(int index);
    void append(T element);
    void insert(T element, int atIndex);
    T removeFirstInstanceOf(T element);
    T removeAllInstancesOf(T element);
    void clear();
    Boolean contains(T element);
    int getLength();
}
