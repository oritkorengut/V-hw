
public class Animal {
    private  boolean mammals;
    private  boolean carnivorous;
    static final int MOOD_HAPPY = 1;
    static final int MOOD_SCARE = 2;
    private  int  mood;


    //Constructor
    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }


    //Getters and Setters
    public boolean isMammals() {
        return mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean getCarnivorous() {
        return carnivorous;
    }

    public void isCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    //Functions
    public void sayHello(){

    }

    public void sayHello(int mood){

    }

    public int getMood(){
        return this.mood;
    }

}
