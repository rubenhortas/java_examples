package enums;

public class ImplementationExample {
    // An enum can implement one or more interfaces.
    @SuppressWarnings("unused")
    private enum StupidEnum implements StupidInterface {
        RALPH, LISA, BART;

        @Override
        public void printStupidStuff() {
            System.out.println("I'm an unitard!!!");
        }
    }

    public static void main(String[] args) {
        StupidEnum stupidEnum = StupidEnum.RALPH;
        stupidEnum.printStupidStuff();
    }
}
