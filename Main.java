import Bag.Bag;
import Bag.ArrayBag;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Bag<Integer> a = new LinkedBag<Integer>();
//        Bag<Integer> c = new LinkedBag<Integer>();
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println();
//        a = c;
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println();
//        a = null;
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println();



        Bag<Integer> b = new ArrayBag<Integer>();
        b.add(2);
        b.add(4);
        b.add(2);
        b.add(7);

        System.out.println(Arrays.toString(b.toArray()));
        b.removeAll();
        System.out.println(Arrays.toString(b.toArray()));
    }
}
