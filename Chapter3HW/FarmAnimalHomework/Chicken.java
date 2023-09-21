package ITEC2150.Chapter3HW.FarmAnimalHomework;

/**
 * class: Chicken
 * author: Eden
 * date: 09/20/2023
 * description: chicken class subclass implementing superclass farm animals
 */
public class Chicken extends FarmAnimals {

    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    private String sound;

    String chickenSound() {
        if (this.getGender() == "Male") {
            sound = "Cock-a-doodle-doo";
        }
        else {
            sound = "Cluck Cluck";
        }
        return sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-4pm";
    }

    @Override
    public String toString() {
        return "Chicken " + chickenSound() + super.toString();
    }
}
