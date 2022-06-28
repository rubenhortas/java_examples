package enums;

public class ImplementationExample {
    // An enum can implement one or more interfaces.
    @SuppressWarnings("unused")
    private enum MyEnum implements MyInterface {
        RALPH, LISA, BART;

        @Override
        public void printStuff() {
            System.out.println("I'm an unitard!!!");
        }
    }

    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.RALPH;
        myEnum.printStuff();
    }
}
