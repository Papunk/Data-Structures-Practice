import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ArrayStack;
import Stack.LinkedStack;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Integer> a = new LinkedStack<Integer>();
        for (int i = 0; i < 10; i++) {
            a.push(i);
        }

        System.out.println(Arrays.toString(a.toArray()));

    }
}
