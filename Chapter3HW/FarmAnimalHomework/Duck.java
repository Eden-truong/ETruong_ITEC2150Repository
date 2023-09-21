package ITEC2150.Chapter3HW.FarmAnimalHomework;

/**
 * class: Duck
 * author: Eden
 * date: 09/20/2023
 * description: subclass duck that inherits the superclass FarmAnimals
 */
public class Duck extends FarmAnimals{
    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    private String sound = "Quack Quack";

    @Override
    String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }

    @Override
    public String toString() {
        return "Duck " + sound + super.toString();
    }
}
