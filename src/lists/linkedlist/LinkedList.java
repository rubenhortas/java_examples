package lists.linkedlist;

import iterator.Item;

/* LinkedList implements List interface like ArrayList, but performs
   insertion and removal in the middle of the lists.list more efficiently than
   ArrayList. It's less efficient for random-access operations. */
public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Item> items = new java.util.LinkedList<>(Item.arrayList(10));

        System.out.println(items.poll());

        System.out.println("List: " + items);

        items.addFirst(new Item(0));
        System.out.println("After addFirst(): " + items);

        items.offer(new Item(99));
        System.out.println("After offer(): " + items);

        items.add(new Item(100));
        System.out.println("After add(): " + items);

        items.addLast(new Item(101));
        System.out.println("After addLast(): " + items);

        items.removeLast();
        System.out.println("After removeLast(): " + items);
    }
}