import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ArrayStack2;
import Stack.LinkedStack;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayBag<Integer> a = new ArrayBag<Integer>();
        for (int i = 0; i < 21; i++) {
            a.add(i);
        }

       for (Integer i: a) {
           System.out.println(i);
       }

    }
}
