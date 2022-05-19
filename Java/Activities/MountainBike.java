package activities;

public class MountainBike extends Bicycle{
    int seatHeight=0;
    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight =seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        System.out.println("SeatHeight is : " +seatHeight);
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }

    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
