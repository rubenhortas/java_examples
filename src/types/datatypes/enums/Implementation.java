package types.datatypes.enums;

public class Implementation {
    // An enum can implement one or more interfaces
    @SuppressWarnings("unused")
    private enum SimpsonsCharacters implements ISimpsonsCharacters {
        Ralph, Lisa, Bart;

        @Override
        public void printStuff() {
            System.out.println("I'm an unitard!!!");
        }
    }

    public static void main(String[] args) {
        SimpsonsCharacters simpsonsCharacter = SimpsonsCharacters.Ralph;
        simpsonsCharacter.printStuff();
    }
}
