package Bag;

public class LinkedBag<T> implements Bag<T> {

    private Node firstNode;
    private int numOfElems;

    public LinkedBag() {
        firstNode = null;
        numOfElems = 0;
    }

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
        Node currentNode = firstNode;

        while (currentNode != null) {
            if (currentNode.equals(elem)) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public boolean hasDuplicates() {
        Node currentNode = firstNode;

        while (currentNode != null) {
            if (this.getFrecuencyOf(currentNode.data) >= 1) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void add(T newEntry) {
        firstNode = new Node(newEntry, firstNode);
        numOfElems += 1;
    }

    @Override
    public T remove() {
        T n = firstNode.data;
        firstNode = firstNode.next;
        return n;
    }

    @Override
    public T remove(T elem) {
        //TODO test
        Node previousNode = firstNode;
        Node currentNode = firstNode.next;

        if (previousNode.equals(elem)) {
            previousNode = null;
            return elem;
        }

        while (currentNode != null); {
            if (currentNode.equals(elem)) {
                previousNode.next = currentNode.next;
                return elem;
            }
            previousNode = previousNode.next;
            currentNode = currentNode.next;
        }

        return null;
    }

    @Override
    public int getFrecuencyOf(T elem) {
        int tally = 0;
        Node currentNode = firstNode;

        while (currentNode != null) {
            tally += currentNode.data.equals(elem)? 1:0;
            currentNode = currentNode.next;
        }
        return tally;
    }

    @Override
    public void removeAll() {
        int index = 0;

        while (index < numOfElems) {
            firstNode = firstNode.next;
            index++;
        }
    }

    @Override
    public T[] toArray() {
        T[] arr = (T[]) new Object[numOfElems];
        int index = 0;
        Node currentNode = firstNode;

        while (currentNode != null) {
            arr[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }

        return arr;
    }

    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this(data, null);
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
