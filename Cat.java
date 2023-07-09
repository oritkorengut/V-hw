
public class Cat extends Animal implements  Land {
    private final int numberOfLegs = 4;

    //Constructor
    public Cat(boolean mammals, boolean carnivorous, int mood) {
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
                System.out.println("purr, purr");
                break;
            case MOOD_SCARE :
                System.out.println("hiss");
                break;
            default:
                System.out.println("meow");
        }
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
