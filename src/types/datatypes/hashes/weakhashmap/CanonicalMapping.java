package types.datatypes.hashes.weakhashmap;

import java.util.WeakHashMap;

/* 	WeakHashMap is a class designed to make the creation of canonicalize mappings easier.
	In such a mapping, you are saving storage by creating only one instance of a particular value.
   	When the program needs that value, it looks up the existing object in the mapping and uses that.
   	This is a storage-saving technique. */
public class CanonicalMapping {
    private final static int size = 1000;

    @SuppressWarnings({"MismatchedReadAndWriteOfArray", "MismatchedQueryAndUpdateOfCollection"})
    public static void main(String[] args) {
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> weakHashMap = new WeakHashMap<>();

        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));

            if ((i % 3) == 0) {
                keys[i] = k; // Save as "real" references
            }

            weakHashMap.put(k, v);
        }

        System.gc();
    }
}
