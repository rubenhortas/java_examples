package iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    @SuppressWarnings("WhileLoopReplaceableByForEach")
    public static void main(String[] args) {
        List<Item> itemList = Item.arrayList(4);
        Iterator<Item> it = itemList.iterator();

        while (it.hasNext()) {
            Item i = it.next();
            System.out.println(i.toString());
        }
    }
}
