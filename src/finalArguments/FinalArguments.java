package finalArguments;

public class FinalArguments {
    void withFinalArguments(final MyClass mc) {

        /*
         * The final local variable mc cannot be assigned. It must be blank and
         * not using a compound assignment.
         */
        //mc = new MyClass(); // illegal, mc is final
    }

    void withoutFinalArguments(MyClass mc) {
        mc = new MyClass(); // mc not final
        mc.doSomething();
    }

    public static void main(String[] args) {
        FinalArguments fa = new FinalArguments();
        fa.withoutFinalArguments(null);
        fa.withFinalArguments(null);
    }
}
