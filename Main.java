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
        ArrayStack2<Integer> a = new ArrayStack2<Integer>();
        for (int i = 0; i < 21; i++) {
            a.push(i);
        }

        System.out.println(Arrays.toString(a.toArray()));
        a.pop();
        System.out.println(Arrays.toString(a.toArray()));

    }
}
