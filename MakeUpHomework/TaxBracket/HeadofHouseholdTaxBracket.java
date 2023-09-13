package ITEC2150.TaxBracket;

public class HeadofHouseholdTaxBracket extends TaxBracket {
    private double[] headHousehold = {15700, 59850, 95350, 182100, 231250, 578100};

    public HeadofHouseholdTaxBracket(double income, double[] rate, double amountPaid, double finalIncome, double[] headHousehold, double[] bracketPlaceholder) {
        super(income, rate, amountPaid, finalIncome, bracketPlaceholder);
        this.headHousehold = headHousehold;
    }
    public HeadofHouseholdTaxBracket() {}

    @Override
    public void calculation() {
        super.setBracketPlaceholder(headHousehold);
        super.calculation();
    }

    public void display() {
        System.out.println("you will be paying (as a head of household):");
        super.display();
    }

    public double[] getHeadHousehold() {
        return headHousehold;
    }

    public void setHeadHousehold(double[] headHousehold) {
        this.headHousehold = headHousehold;
    }
}
