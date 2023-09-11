package MakeupHomework.BakeryHW;

import java.util.ArrayList;

public class Bakery {
    private ArrayList<Pastry> pastries;
    private ArrayList<Cake> cakes;

    public Bakery() {
        pastries = new ArrayList<>();
        cakes = new ArrayList<>();
    }

    public void addPastry(Pastry pastry) {
        pastries.add(pastry);
    }

    public void addCakes(Cake cake) {
        cakes.add(cake);
    }

    public void displayPastries() {
        System.out.println("Pastries in the bakery:");
        for (Pastry pastry : pastries) {
            System.out.println("Pastry: " + pastry.getName());
            pastry.displayIngredients();
            System.out.println();
        }
    }

    public void displayCakes() {
        System.out.println("Cakes in the bakery:");
        for (Cake cake : cakes) {
            System.out.println("Cake: " + cake.getName());
            cake.displayIngredients();
            System.out.println();
        }
    }
}
