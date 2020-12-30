package stack;

import iterator.Item;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Item class from Iterator example
        Stack<Item> stack = new Stack<>();
        List<Item> items = Item.arrayList(10);

        for (Item item : items) {
            stack.push(item);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
