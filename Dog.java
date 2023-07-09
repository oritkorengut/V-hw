
public class Dog extends Animal implements  Land{
    private final int numberOfLegs = 4;

    //Constructor
    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    //Functions
    @Override
    public void sayHello() {
        this.sayHello(this.getMood());
    }

    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY :
                System.out.println("bark loudly");
                break;
            case MOOD_SCARE :
                System.out.println("whooping");
                break;
            default:
                System.out.println("wagging their tails");
        }
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
