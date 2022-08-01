package types.datatypes.hashes.weakhashmap;

public class Element {
    private final String identity;

    public Element(String id) {
        identity = id;
    }

    public String toString() {
        return identity;
    }

    public int hashCode() {
        return identity.hashCode();
    }

    public boolean equals(Object r) {
        return r instanceof Element &&
                identity.equals(((Element) r).identity);
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + identity);
    }
}
