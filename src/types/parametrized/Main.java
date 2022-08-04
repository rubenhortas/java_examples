package types.parametrized;

public class Main {
    public static void main(String[] args) {
        System.out.println("CustomClass");
        ParametrizedHandler<CustomClass> ph = new ParametrizedHandler<>(new CustomClass());
        ph.get();

        System.out.println("String");
        ParametrizedHandler<String> ph2 = new ParametrizedHandler<>("");
        ph2.get();
    }
}
