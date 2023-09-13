package ITEC2150.TaxBracket;

public class MarriedSeparatelyTaxBracket extends TaxBracket {
    protected double[] separateMarry = {11000, 44725, 95375, 182100, 231250, 346875};

    public MarriedSeparatelyTaxBracket(double income, double amountPaid, double finalIncome, double[] rate, double[] separateMarry, double[] bracketPlaceholder) {
        super(income, rate, amountPaid, finalIncome, bracketPlaceholder);
        this.separateMarry = separateMarry;
    }
    public MarriedSeparatelyTaxBracket() {}


    @Override
    public void calculation() {
        super.setBracketPlaceholder(separateMarry);
        super.calculation();
    }
    public void display() {
        System.out.println("for your bracket (seperately filing married couple)");
        super.display();
    }

    public double[] getSeparateMarry() {
        return separateMarry;
    }

    public void setSeparateMarry(double[] seperateMarry) {
        this.separateMarry = seperateMarry;
    }
}
