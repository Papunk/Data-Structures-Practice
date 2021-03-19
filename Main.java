import Bag.Bag;
import Bag.ArrayBag;
import Bag.LinkedBag;
import SimpleList.ArraySimpleList;
import Stack.Stack;
import Stack.ExpressionHelper;
import Stack.ArrayStack;
import Stack.LinkedStack;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ExpressionHelper h = new ExpressionHelper();

        System.out.println(Arrays.toString(h.convertToRPN("3+4*1")));
    }
}
