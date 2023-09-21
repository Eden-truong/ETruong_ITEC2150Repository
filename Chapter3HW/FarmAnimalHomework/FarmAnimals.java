package ITEC2150.Chapter3HW.FarmAnimalHomework;
/**
 * class: FarmAnimals
 * author: Eden
 * date: 09/20/2023
 * description: super class for different types of farm animals
 */

public abstract class FarmAnimals {
    //data
    private String name;
    private String gender;
    private double weight;
    private int age;

    //constructor
    public FarmAnimals(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract String feedLoadingSchedule();

    //toString method

    @Override
    public String toString() {
        return " [" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                "]";
    }
}
