package Bag;

public final class ArrayBag<T> implements Bag<T> {

    // variables

    private T[] bag;
    private int numOfElems;

    // static variables

    private static final int DEFAULT_CAPACITY = 25;

    // constructors

    public ArrayBag() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numOfElems = 0;
    }

    public ArrayBag(int cap) {
        if (cap <= DEFAULT_CAPACITY) {
            bag = (T[]) new Object[DEFAULT_CAPACITY];
        }
        else {
            bag = (T[]) new Object[cap];
        }
        numOfElems = 0;
    }

    // spec funcs

    @Override
    public int getCurrentSize() {
        return numOfElems;
    }

    @Override
    public boolean isEmpty() {
        return numOfElems == 0;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public boolean hasDuplicates() {
        return false;
    }

    @Override
    public void add(T newEntry) {
        if (numOfElems >= bag.length) {
            T[] newBag = (T[]) new Object[bag.length * 2];
            for (int i = 0; i < bag.length; i++) {
                newBag[i] = bag[i];
            }
            bag = newBag;
        }

        bag[numOfElems] = newEntry;
        numOfElems++;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T remove(T elem) {
        return null;
    }

    @Override
    public int getFrecuencyOf(T elem) {
        return 0;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public T[] toArray() {
        return null;
    }

}
