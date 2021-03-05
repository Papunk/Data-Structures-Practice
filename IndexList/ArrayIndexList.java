package IndexList;

public class ArrayIndexList<T> implements IndexList {

    private T[] list;
    private int numberOfElements;
    private static int DEFAULT_LENGTH = 25;

    public ArrayIndexList() {
        list = (T[]) new Object[DEFAULT_LENGTH];
        numberOfElements = 0;
    }

    @Override
    public T getElementAt(int index) {
        return (index < numberOfElements)? list[index] : null;
    }

    @Override
    public void append(Object element) {

    }

    @Override
    public void insert(Object element, int atIndex) {

    }

    @Override
    public T removeFirstInstanceOf(Object element) {
        return null;
    }

    @Override
    public T removeAllInstancesOf(Object element) {
        return null;
    }

    @Override
    public void clear() {
        list = (T[]) new Object[DEFAULT_LENGTH];
        numberOfElements = 0;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < numberOfElements; i++) {
            if (list[i].equals(element)) return true;
        }
        return false;
    }

    @Override
    public int getLength() {
        return numberOfElements;
    }
}
