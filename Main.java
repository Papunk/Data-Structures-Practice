import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import Recursion.RecursionBasics;
import SimpleList.ArraySimpleList;
import SortedList.IntegerArrayListSortedList;
import SortedList.IntegerLinkedSortedList;
import Stack.Stack;
import Stack.ArrayStack2;
import Stack.LinkedStack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import Bag.LinkedBag.LinkedBagIterator;

public class Main {

    public static void main(String[] args) {
        IntegerArrayListSortedList l = new IntegerArrayListSortedList();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int n = r.nextInt(100);
            System.out.println(n);
            l.add(n);
        }

        System.out.println(Arrays.toString(l.toArray()));

    }
}
