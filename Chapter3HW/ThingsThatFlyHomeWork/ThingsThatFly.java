package ITEC2150.Chapter3HW.ThingsThatFlyHomeWork;

/**
 * class: ThingsThatFly
 * author: Eden
 * date: 09/21/2023
 * description: tester class
 */
import java.util.ArrayList;
import java.util.List;

public class ThingsThatFly {

    public static void main(String[] args) {
        //vars
        List<Flight> flyingList = new ArrayList<Flight>();

        Bird bird1 = new Bird("Hummingbird");
        Bird bird2 = new Bird("Eagle");
        Airplane airplane = new Airplane("McDouglas DC9", 1965);

        //adding stuff in the arrayList
        flyingList.add(bird1);
        flyingList.add(bird2);
        flyingList.add(airplane);

        //enhanced for loop display
        for(Flight flying: flyingList) {
            System.out.print(flying + ": ");
            flying.fly();
        }
    }
}
