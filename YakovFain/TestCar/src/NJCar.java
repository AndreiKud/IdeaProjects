/**
 * Created by Andrei on 011 11.01.17.
 */
public class NJCar extends Car {

    public void StartEngine() {
        System.out.println("Overrided, lol");
    }

    public void StartEngine(int num) {
        System.out.println("Overloaded with " + num);
    }
}
