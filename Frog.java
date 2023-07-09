
public class Frog extends  Animal implements  Land, Water{
    private final int numberOfLegs = 4;

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY :
                System.out.println("quack quack quack");
                break;
            case MOOD_SCARE :
                System.out.println("plop into the water");
                break;
            default:
                System.out.println("quack quack quack");
        }
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
