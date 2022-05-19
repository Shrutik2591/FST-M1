package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args){

        HashSet hs = new HashSet();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");

        System.out.println("Size of the HashSet : " +hs.size());
        hs.remove("two");

        if(hs.remove("two")){
            System.out.println("two is removed from teh set");
        }
        else{
            System.out.println("two is not present in the set");
        }
        System.out.println("Item One is present in the set or not? " + hs.contains("one"));
        System.out.println("Updated Set : " + hs);
    }
}
