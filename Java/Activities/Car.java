package activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(String color,String transmission, int make, int tyres, int doors){
        this.color= color;
        this.doors=doors;
        this.transmission=transmission;
        this.make=make;
        this.tyres=tyres;
        System.out.println(" Car color is " + this.color);
        System.out.println(" Transmission " + this.transmission);
        System.out.println(" Make is " + this.make);
        System.out.println(" Car tyres is " + this.tyres);
        System.out.println(" Car doors are " + this.doors);
    }
    public void accelerate(){
        System.out.println(" Car is moving forward");
    }
    public void brake(){
        System.out.println(" Car has stopped");
    }
}
