package main;

import items.Computer;
import items.Item;
import items.Mouse;
import items.Speaker;

public class Main {

    public static void main(String[] args) {

        Computer myComputer = new Computer("myComputer", "IBM", "black", "IBM Europe", true);

        Mouse myMouse = new Mouse("myMouse", "DELL", "black", "DELL USA", false);

        Speaker mySpeaker = new Speaker("mySpeaker", "SONY", "black and white","SONY China", 120);


        Item[] myElectronicStaffs = {myComputer, myMouse, mySpeaker};
        System.out.println("My computer's color is " + myElectronicStaffs[0].getColor());

        printColorOfItem(myElectronicStaffs);

    }

    public static void printColorOfItem(Item[] array) {
        for (Item item : array) {
            System.out.println(item.getName() +
                    " has the following colour: " + item.getColor());
        }
    }
}
