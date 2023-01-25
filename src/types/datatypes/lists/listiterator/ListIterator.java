package types.datatypes.lists.listiterator;

import iterator.Item;

import java.util.List;

/*  The ListIterator is a more powerful subtype of Iterator that is produced only by list classes.
    ListIterator is bidirectional, can move forward and backward. */
public class ListIterator {
    public static void main(String[] args) {
        // Item class from Iterator example
        List<Item> items = Item.arrayList(10);
        java.util.ListIterator<Item> it = items.listIterator();

        // Forward
        while (it.hasNext()) {
            System.out.println("Item: " + it.next().toString() + "\tNext Index: " + it.nextIndex() + "\tPrevious Index: " + it.previousIndex());
        }

        // Backwards
        while (it.hasPrevious()) {
            System.out.println("Item: " + it.previous().toString() + "\tPrevious Index: " + it.previousIndex() + "\tNext Index: " + it.nextIndex());
        }
    }
}
