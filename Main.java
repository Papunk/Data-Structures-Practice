import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ArrayStack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> a = new ArrayStack<Integer>();
        for (int i = 0; i < 100; i++) {
            a.push(i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(a.pop());
        }
    }
}
