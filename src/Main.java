/*
Creating an ArrayList to hold values
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create the arraylist, it can adjust it's capacity, hence the name Dynamic Arrays
        ArrayList<String> ourList = new ArrayList<>();

        ourList.add("Michael");
        ourList.add("Louise");

        System.out.println(ourList);
        System.out.println(ourList.get(0));
        ourList.set(0,"Mick");
        System.out.println(ourList);
        ourList.remove(0);
        System.out.println(ourList);
        String removed = ourList.remove(0);
        System.out.println(removed);
        System.out.println(ourList.isEmpty());

        ourList.add("Michael G");
        ourList.add("Erin");
        ourList.add("Jono");
        System.out.println(ourList.contains("Jono"));
        System.out.println(ourList.size());

    }

}