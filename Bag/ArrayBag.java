package Bag;

import java.util.*;
import java.util.function.Consumer;

public final class ArrayBag<T> implements Bag<T>, Iterable<T> {

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
    public boolean contains(T elem) {
        for (T item: this.toArray()) {
            if (item != null && item.equals(elem)) return true;
        }
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
        Random r = new Random();
        int num = r.nextInt(numOfElems);
        T elem = bag[num];
        for (int i = num; i < numOfElems; i++) {
            if (i == bag.length - 1) bag[i] = null;
            else bag[i] = bag[i + 1];
        }
        numOfElems--;
        return elem;
    }

    @Override
    public T remove(T elem) {
        return null;
    }

    @Override
    public int getFrecuencyOf(T elem) {
        int tally = 0;
        for (T item: this.toArray()) {
            if (item.equals(elem)) tally++;
        }
        return tally;
    }

    public int recursiveGetFrecuencyOf(T elem) {
        return recursiveGetFrecuencyOf(elem, toArray());
    }

    private int recursiveGetFrecuencyOf(T elem, T[] arr) {
        if (arr.length == 0) return 0;
        int i = 0;
        if (arr[0].equals(elem)) i++;
        return i + recursiveGetFrecuencyOf(elem, Arrays.copyOfRange(arr, 1, arr.length));
    }

        @Override
    public void removeAll() {
        bag = (T[]) new Object[bag.length];
        numOfElems = 0;
    }

    public int getIndexOf(T elem) {
        return getIndexOf(elem, toArray(), 0);
    }

    private int getIndexOf(T elem, T[] arr, int offset) {
        if (arr.length == 0) return -1;
        if (arr[0].equals(elem)) {
            return offset;
        }
        int i = getIndexOf(elem, Arrays.copyOfRange(arr, 1, arr.length), offset + 1);
        if (i < 0) return i;
        else return offset;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(bag, numOfElems);
    }

    public ArrayBag<T> union(Bag<T> otherBag) {

        ArrayBag union = new ArrayBag();

        for (T elem: otherBag.toArray()) {
            union.add(elem);
        }
        for (T elem: this.toArray()) {
            union.add(elem);
        }

        return union;
    }

    public ArrayBag<T> intersection(Bag<T> otherBag) {

        ArrayBag intersect = new ArrayBag();

        for (T elem: otherBag.toArray()) {
            if (this.contains(elem)) intersect.add(elem);
        }

        return intersect;
    }

    public ArrayBag<T> difference(Bag<T> otherBag) {

        ArrayBag dif = new ArrayBag();

        for (T elem: this.toArray()) {
            if (dif.contains(elem)) continue;
            int n = this.getFrecuencyOf(elem) - otherBag.getFrecuencyOf(elem);
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    dif.add(elem);
                }
            }
        }

        return dif;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayBagIterator<T>(this);
    }

    private class ArrayBagIterator<T> implements Iterator<T> {

        private T[] bag;
        private int size;
        private int count = 0;

        public ArrayBagIterator(ArrayBag<T> bag) {
            this.bag = bag.toArray();
            this.size = bag.getCurrentSize();
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public T next() {
            if (!hasNext()) return null;

            T elem = bag[count];
            count++;
            return elem;
        }
    }
}
