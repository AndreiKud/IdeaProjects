/**
 * Created by Andrei on 011 11.01.17.
 */
public class TestCar {

    /**
     *  Creates two Car instances
     */
    public static void main(String[] args){
        Car car1 = new Car("Green", 7);
        Car car2 = new Car("Red",90);
        ModifiedCar car3 = new ModifiedCar();
        NJCar car4 = new NJCar();

        if (1 == 2) {};
        car3.color = "Black";
        car3.isLasersOn = true;
        car4.numberOfDoors = 50;

        car1.StartEngine();
        car2.StopEngine();
        car3.StartEngine();
        car4.StartEngine();
        car4.StartEngine(25);

        System.out.println("THE FUCKING GUN IS " + car3.SET_FUCKING_GUN);
        System.out.println("Cars have been painted");
    }
}
