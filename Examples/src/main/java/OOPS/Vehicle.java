package OOPS;

public class Vehicle {
    int model;
    String make;
    public void Car(int carmodel, String carmake){
        model = carmodel;
        make = carmake;
    }
    public void start()
    {
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
