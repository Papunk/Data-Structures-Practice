import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;

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


        Bag B1 = new LinkedBag();
        B1.add(1);
        B1.add(2);
        B1.add(2);
        B1.add(2);
        B1.add(3);
        B1.add(1);
        B1.add(4);
        B1.remove(1);
        System.out.println(B1.getFrecuencyOf(1));

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
