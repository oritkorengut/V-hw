
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Animal[] animals = new Animal[6];
        animals[0] = new Cat(true, true, 1);
        animals[1] = new Cat(true, true, 2);
        animals[2] = new Dog(true, true, 1);
        animals[3] = new Dog(true, true, 2);
        animals[4] = new Frog(false, false, 1);
        animals[5] = new Frog(false, false, 2);
        for (int i = 0; i < animals.length; i++) {
            animals[i].sayHello(Animal.MOOD_HAPPY);
            animals[i].sayHello(Animal.MOOD_SCARE);
            animals[i].sayHello();
        }
	// write your code here

    }
}
