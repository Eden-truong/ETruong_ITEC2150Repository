package ITEC2150.Chapter3HW.ThingsThatFlyHomeWork;

/**
 * class: Bird
 * author: Eden
 * date: 09/21/2023
 * description: implements Flight, with its own attribute and method override
 */
public class Bird implements Flight, Movement {
    //attributes
    private String type;

    //constructor
    public Bird(String type) {
        this.type = type;
    }

    //method overriding
    @Override
    public void fly() {
        System.out.println("Flying with my wings flapping.");
    }
    @Override
    public void walk() {
        System.out.println("I waddlewaddle.");
    }
    @Override
    public void jump() {
        System.out.println("I have feet and I can Jump!");
    }
    //setters and getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString
    @Override
    public String toString() {
        return "Bird [" +
                "type='" + type + '\'' +
                ']';
    }
}
