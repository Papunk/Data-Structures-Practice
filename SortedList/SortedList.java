package SortedList;

public interface SortedList<T> {

    void add(T entry);
    void remove(T entry);
    void getPosition(T entry);
    public T get(int givenPosition);
    public int size();
    public boolean isEmpty();
    public T[] toArray();
}
