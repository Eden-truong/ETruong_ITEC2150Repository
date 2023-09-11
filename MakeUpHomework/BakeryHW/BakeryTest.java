package MakeupHomework.BakeryHW;

public class BakeryTest {
    public static void main(String[] args) {
        Ingredient flour = new Ingredient("Flour");
        Ingredient sugar = new Ingredient("Sugar");
        Pastry croissant = new Pastry("Croissant");

        croissant.addIngredient(flour);
        croissant.addIngredient(sugar);

        Pastry muffin = new Pastry("Blueberry Muffin");
        muffin.addIngredient(flour);
        muffin.addIngredient(sugar);

        Cake myCake = new Cake("Large", "Wild berry", "Wild Berry Wedding Cake");
        myCake.addIngredient(flour);
        myCake.addIngredient(sugar);

        Bakery bakery = new Bakery();
        bakery.addPastry(croissant);
        bakery.addPastry(muffin);

        bakery.addCakes(myCake);

        bakery.displayPastries();
        bakery.displayCakes();

    }
}
