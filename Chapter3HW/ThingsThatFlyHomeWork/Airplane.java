package ITEC2150.Chapter3HW.ThingsThatFlyHomeWork;

/**
 * class: Airplane
 * author: Eden
 * date: 09/21/2023
 * description: implements flight, with its own attribute and method override
 */
public class Airplane implements Flight, Movement {
    //attributes
    private String model;
    private int yearBuild;
    //constructor
    public Airplane(String model, int yearBuild) {
        this.model = model;
        this.yearBuild = yearBuild;
    }

    //method overriding
    @Override
    public void fly() {
        System.out.println("Flying with jet engines.");
    }
    @Override
    public void walk() {
        System.out.println("I tax with my wheeeeels.");
    }
    @Override
    public void jump() {
        System.out.println("I'm too heavy :(");
    }
    //setters and getters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }
    //toString
    @Override
    public String toString() {
        return "Airplane [" +
                "model='" + model + '\'' +
                ", yearBuild=" + yearBuild +
                ']';
    }
}
