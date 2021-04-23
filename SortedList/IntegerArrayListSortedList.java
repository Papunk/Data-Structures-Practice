package SortedList;

import java.util.ArrayList;

public class IntegerArrayListSortedList implements IntegerSortedList {

    private ArrayList<Integer> list;

    public IntegerArrayListSortedList() {
        list = new ArrayList<Integer>();
    }

    @Override
    public void add(int entry) {
        if (list.isEmpty()) list.add(entry);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > entry) {
                list.add(i, entry);
                break;
            }
        }
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
        return false;
    }

    @Override
    public int[] toArray() {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
