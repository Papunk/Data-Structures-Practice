package Bag;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedBag<T> implements Bag<T>, Iterable<T> {

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
        if (firstNode == null) return null;

        T n = firstNode.data;
        firstNode = firstNode.next;
        numOfElems--;
        return n;
    }

    @Override
    public T remove(T elem) {
        if (numOfElems == 0) return null;

        Node currentNode = firstNode;

        while (currentNode != null) {
            if (currentNode.data.equals(elem)) {
                currentNode.data = firstNode.data;
                firstNode = firstNode.next;
                numOfElems--;
                return elem;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    private void removeNode(Node node) {
        if (firstNode.equals(node)) {
            firstNode = firstNode.next;
            return;
        }

        Node currentNode = firstNode;
        Node nextNode = currentNode.next;

        while (nextNode != null && currentNode != null) {
            if (nextNode.equals(node)) {
                currentNode.next = nextNode.next;
                return;
            }
            currentNode = currentNode.next;
            nextNode = nextNode.next;
        }
    }

    private Node getElemBefore(Node node) {
        Node currentNode = firstNode;
        Node nextNode = currentNode.next;

        while (currentNode != null && nextNode != null) {
            if (nextNode == node) {
                return currentNode;
            }
            currentNode = currentNode.next;
            nextNode = nextNode.next;
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
        firstNode = null;
        numOfElems = 0;
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

    public LinkedBagIterator iterator() {
        return new LinkedBagIterator();
    }

    public class LinkedBagIterator implements Iterator {

        private Node lastNode;
        private Node currentNode;
        private boolean calledNext = false;

        public LinkedBagIterator() {
            currentNode = (Node) firstNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();

            T currentNodeData = (T) currentNode.data;
            lastNode = currentNode;
            currentNode = currentNode.next;
            calledNext = true;
            return currentNodeData;
        }

        public T previous() {
            if (!hasPrevious()) throw new UnsupportedOperationException();
            currentNode = lastNode;
            lastNode = getElemBefore(currentNode);
            return currentNode.data;
        }

        public boolean hasPrevious() {
            return currentNode != firstNode;
        }

        @Override
        public void remove() {
            if (!calledNext) throw new UnsupportedOperationException();
            removeNode(lastNode);
            calledNext = false;
        }

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
