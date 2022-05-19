package activities;

import java.util.HashMap;


public class Activity11 {
    public static void main(String[] args){

        HashMap<Integer, String > colors = new HashMap<Integer,String>();
        colors.put(1, "pink");
        colors.put(2, "blue");
        colors.put(3, "black");
        colors.put(4, "Red");
        colors.put(5, "green");
        System.out.println("MAP : " + colors);
        colors.remove(2);
        System.out.println("Green exists in Map ? " + colors.containsValue("green"));
        System.out.println("Size of the Map : " + colors.size());


    }
}
