package MakeupHomework.BakeryHW;

public class Cake extends Pastry {
    private String size;
    private String flavor;

    public Cake(String size, String flavor, String name) {
        super(name);
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void displayIngredients() {
        super.displayIngredients();
        System.out.println("size: " + size);
        System.out.println("flavor: " + flavor);
    }
    public String getName() {
        return super.getName();
    }
}
