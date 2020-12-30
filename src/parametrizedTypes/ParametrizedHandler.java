package parametrizedTypes;

public class ParametrizedHandler<T> {

    private final T t;

    public ParametrizedHandler(T t) {
        this.t = t;
    }

    public T get() {
        System.out.println(this.t.getClass().getName());
        return this.t;
    }
}
