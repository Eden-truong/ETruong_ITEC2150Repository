package ITEC2150.Chapter3HW.ThingsThatFlyHomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 * class: ThingsThatMove
 * author: Eden
 * date: 09/21/2023
 * description: 2nd tester class for 3rd part of the homework
 */
public class ThingsThatMove {
    public static void main(String[] args) {
        //vars
        List<Flight> flyingList = new ArrayList<Flight>();

        Bird bird1 = new Bird("Hummingbird");
        Bird bird2 = new Bird("Eagle");
        Airplane airplane = new Airplane("McDouglas DC9", 1965);

        //adding stuff to the array
        flyingList.add(bird1);
        flyingList.add(bird2);
        flyingList.add(airplane);

        for(Flight flying: flyingList) {
            System.out.println(flying);
            flying.fly();
            flying.walk();
            flying.jump();
        }
    }
}
