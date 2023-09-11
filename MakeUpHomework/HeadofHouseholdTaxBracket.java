package ITEC2150.TaxBracket;

public class HeadofHouseholdTaxBracket {
    private double[] headHousehold = {0, 15700, 59850, 95350, 182100, 231250, 578100};

    public HeadofHouseholdTaxBracket(double income, double[] rate, double[] headHousehold) {
        this.headHousehold = headHousehold;
    }

    public double[] getHeadHousehold() {
        return headHousehold;
    }

    public void setHeadHousehold(double[] headHousehold) {
        this.headHousehold = headHousehold;
    }
}
