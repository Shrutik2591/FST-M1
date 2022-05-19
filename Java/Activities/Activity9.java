package activities;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args){
        ArrayList myList =new ArrayList<String>();
        myList.add("Shruti1");
        myList.add("Shruti2");
        myList.add("Shruti3");
        myList.add("Shruti4");
        myList.add("Shruti5");

        for(int i=0; i<=myList.size()-1;i++){
            System.out.println("Name in the List is : " +myList);
        }

        System.out.println("3rd element in the ArrayList : " + myList.get(2));
        boolean contName = myList.contains("Shruti3");
        System.out.println("Shruti3 name exists in the ArrayList? : " + contName);

        System.out.println("Size of ArrayList : " +myList.size());
        myList.remove("Shruti3");
        System.out.println("Size of ArrayList After removing a name : " +myList.size());
        myList.add("Shruti3");




    }
}
