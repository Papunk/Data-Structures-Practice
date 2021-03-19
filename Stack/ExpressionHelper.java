package Stack;

import java.util.HashMap;

public class ExpressionHelper {

    private HashMap<Character, Integer> operators = new HashMap<>();

    public ExpressionHelper() {
        operators.put('(', 0);
        operators.put('^', 1);
        operators.put('*', 2);
        operators.put('/', 2);
        operators.put('+', 3);
        operators.put('-', 3);
    }

    // TODO this does not work

    public char[] convertToRPN(String expression) {
        char[] infix = expression.toCharArray();
        Stack<Character> opStack = new LinkedStack<Character>();
        char[] rpn = new char[infix.length];
        int index = 0;

        for (int i = 0; i < infix.length; i++) {
            char e = infix[index];
            switch (e) {
                case '(': case '^':
                    opStack.push(e);
                case ')':
                    while (!opStack.peek().equals('(')) {
                        rpn[index] = opStack.pop();
                        index++;
                    }
                    opStack.pop();
                case '+': case '-': case '*': case '/':
                    while (!opStack.isEmpty() && operators.get(opStack.peek()) < operators.get(e)) {
                        rpn[index] = e;
                        index++;
                    }
                    opStack.push(e);
                default:
                    rpn[index] = e;
                    index++;
            }
        }

        return rpn;
    }

    public int calculateRPN(String rpn) {
        Stack<String> stack = new LinkedStack<String>();
        return 0;
    }
}
