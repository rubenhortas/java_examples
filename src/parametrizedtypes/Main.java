package parametrizedtypes;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyCustomClass");
        ParametrizedHandler<MyCustomClass> ph = new ParametrizedHandler<>(new MyCustomClass());
        ph.get();

        System.out.println("String");
        ParametrizedHandler<String> ph2 = new ParametrizedHandler<>("");
        ph2.get();
    }
}
