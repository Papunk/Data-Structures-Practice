import Bag.Bag;
import Bag.LinkedBag;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Bag<Integer> b = new LinkedBag<Integer>();
        b.add(2);
        b.add(4);
        b.add(2);
        b.add(7);

        System.out.println(Arrays.toString(b.toArray()));
        b.remove(7);
        System.out.println(Arrays.toString(b.toArray()));
    }
}
