/**
 * Created by Andrei on 011 11.01.17.
 */
public class Car {

    String color;
    byte numberOfDoors;

    public Car() {
    }

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = (byte)numberOfDoors;

    }

    public void StartEngine() {
        System.out.println("Started");
    }

    public void StopEngine() {
        // some code
    }
}
