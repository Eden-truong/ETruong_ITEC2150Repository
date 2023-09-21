package ITEC2150.Chapter3HW.FarmAnimalHomework;

/**
 * class: Cow
 * author: Eden
 * date: 09/20/2023
 * description: cow subclass implementing FarmAnimals superclass
 */
public class Cow extends FarmAnimals{
    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }
    private String sound = "Moo Moo";

    @Override
    String feedLoadingSchedule() {
        return getName() + ": 6am-4pm";
    }

    @Override
    public String toString() {
        return "Cow " + sound + super.toString();
    }
}
