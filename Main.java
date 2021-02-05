import Bag.Bag;
import Bag.LinkedBag;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Bag<Integer> b = new LinkedBag<Integer>();

        b.add(3);
        b.add(55);
        b.add(123);

        System.out.println(Arrays.toString(b.toArray()));
        b.removeAll();
        System.out.println(Arrays.toString(b.toArray()));

    }
}
