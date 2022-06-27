package stack;

import iterator.Item;

import java.util.List;

public class Stack {
    public static void main(String[] args) {
        // Item class from Iterator example
        java.util.Stack<Item> stack = new java.util.Stack<>();
        List<Item> items = Item.arrayList(10);

        for (Item item : items) {
            stack.push(item);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
