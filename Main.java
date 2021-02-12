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



        ArrayBag<Integer> b = new ArrayBag<Integer>();
        b.add(2);
        b.add(4);
        b.add(2);
        b.add(2);
        b.add(7);

        ArrayBag<Integer> a = new ArrayBag<Integer>();
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(6);

        System.out.println("b:" + Arrays.toString(b.toArray()));
        System.out.println("a:" + Arrays.toString(a.toArray()));
        ArrayBag<Integer> c = b.difference(a);
        System.out.println("c:" + Arrays.toString(c.toArray()));
    }
}
