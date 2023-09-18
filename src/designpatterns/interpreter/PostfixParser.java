package designpatterns.interpreter;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();

        for(char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        return switch (c) {
            case '+' -> new PlusExpression(stack.pop(), stack.pop());
            case '-' -> new MinusExpression(stack.pop(), stack.pop());
            default -> new VariableExpression(c);
        };
    }

}
