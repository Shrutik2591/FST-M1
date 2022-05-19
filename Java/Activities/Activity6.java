package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);
        plane.onboard("Shruti1");
        plane.onboard("Shruti2");
        plane.onboard("Shruti3");
        plane.onboard("Shruti4");
        plane.onboard("Shruti5");
        plane.onboard("Shruti6");
        plane.onboard("Shruti7");
        plane.onboard("Shruti8");
        plane.onboard("Shruti9");
        plane.onboard("Shruti10");
        plane.onboard("Shruti11");
        System.out.println(" Take - Off Time of Plane : " +plane.takeOff());
        System.out.println(" List of passengers : " +plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println(" Last Time Plane Landed : " +plane.getLastTimeLanded());




    }
}
