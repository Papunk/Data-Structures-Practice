package SortedList;

import Bag.LinkedBag;
import Node.GenericNode;

public class IntegerLinkedSortedList implements IntegerSortedList {

    private GenericNode<Integer> first;
    private int size;

    public IntegerLinkedSortedList() {
        this.first = null;
        size = 0;
    }


    @Override
    public void add(int entry) {
        if (isEmpty()) {
            first = new GenericNode<Integer>(entry, null);
            size++;
            return;
        }

        if (entry < first.data) {
            first = new GenericNode<Integer>(entry, first);
            size++;
        }

        GenericNode<Integer> currentNode = first;
        GenericNode<Integer> previousNode = null;

        while (true) {
            if (currentNode == null) {
                previousNode.next = new GenericNode<Integer>(entry, null);
                break;
            }
            if (entry < currentNode.data) {
                previousNode.next = new GenericNode<Integer>(entry, currentNode);
                break;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        size++;
    }

    @Override
    public void remove(int entry) {

    }

    @Override
    public void getPosition(int entry) {

    }

    @Override
    public int get(int givenPosition) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int[] toArray() {
        int[] arr = new int[size];
        int index = 0;
        GenericNode<Integer> currentNode = first;

        while (currentNode != null) {
            arr[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }

        return arr;
    }
}
