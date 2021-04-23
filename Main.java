import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ArrayStack2;
import Stack.LinkedStack;
import java.util.Arrays;
import java.util.Iterator;
import Bag.LinkedBag.LinkedBagIterator;

public class Main {

    public static void main(String[] args) {
        LinkedBag<Integer> bg = new LinkedBag<Integer>();
        for (int i = 0; i < 21; i++) {
            bg.add(i);
        }

        LinkedBagIterator iter = bg.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("---");

        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }


    }
}
