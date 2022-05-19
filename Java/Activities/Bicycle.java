package activities;

public class Bicycle implements BicycleOperations,BicycleParts{


    public int gears;
    public int currentSpeed;

    Bicycle(int gears, int currentSpeed){
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
    public void applyBrake(int decrement){
            this.currentSpeed = this.currentSpeed - decrement;
            System.out.println("Reduce the speed of Bicycle by : " + currentSpeed);
    }
    public void speedUp(int increment){
        this.currentSpeed= this.currentSpeed + increment;
        System.out.println("Increase the speed of Bicycle by : " + currentSpeed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
