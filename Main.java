import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArraySimpleList<Integer> a = new ArraySimpleList<Integer>();
        for (int i = 0; i < 1000; i++) {
            a.add(2);
        }
        System.out.println(Arrays.toString(a.toArray()));
        a.removeFirst();
        System.out.println(Arrays.toString(a.toArray()));
    }
}
