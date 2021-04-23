import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import Recursion.RecursionBasics;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ArrayStack2;
import Stack.LinkedStack;
import java.util.Arrays;
import java.util.Iterator;
import Bag.LinkedBag.LinkedBagIterator;

public class Main {

    public static void main(String[] args) {
        ArrayBag<Integer> b = new ArrayBag<Integer>();

        for (int i = 0; i < 20; i++) {
            b.add(1);
        }

        System.out.println(b.recursiveGetFrecuencyOf(1));

    }
}
