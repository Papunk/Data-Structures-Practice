package IndexList;

import Node.GenericNode;

public class LinkedIndexList<T> implements IndexList {

    private GenericNode<T> first;
    private int numberOfElements;

    @Override
    public Object getElementAt(int index) {
        return null;
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

    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
