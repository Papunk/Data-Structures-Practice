package SortedList;

public interface IntegerSortedList {

    void add(int entry);
    void remove(int entry);
    void getPosition(int entry);
    public int get(int givenPosition);
    public int size();
    public boolean isEmpty();
    public int[] toArray();
}
