import OOPS.Car;
import OOPS.Cycle;
import OOPS.Vehicle;


public class Firstclass {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.Car(2013,"camry");
        vehicle.start();
        vehicle.stop();
        Car c = new Car();
        c.start();
        c.stop();
        Cycle cy = new Cycle();
        cy.start();
        cy.stop();

    }
}
