package iterator;

import java.util.ArrayList;
import java.util.List;

public class Item {
    public final Integer number;
    public final String description;

    public Item(Integer number) {
        this.number = number;
        this.description = String.format("Item %02d", number);
    }

    /*
     * Returns an array list of n Item elements.
     */
    public static List<Item> arrayList(int n) {
        List<Item> itemList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            Item newItem = new Item(i);
            itemList.add(newItem);
        }

        return itemList;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", this.number, this.description);
    }
}
