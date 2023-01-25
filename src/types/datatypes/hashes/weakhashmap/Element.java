package types.datatypes.hashes.weakhashmap;

public class Element {
    private final String id;

    public Element(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }

    public int hashCode() {
        return id.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof Element &&
                id.equals(((Element) object).id);
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + id);
    }
}
