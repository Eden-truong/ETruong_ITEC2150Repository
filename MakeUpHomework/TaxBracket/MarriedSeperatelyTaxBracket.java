package ITEC2150.TaxBracket;

public class MarriedSeperatelyTaxBracket extends TaxBracket {
    private double[] seperateMarry = {0, 11000, 44725, 95375, 182100, 231250, 346875};

    public MarriedSeperatelyTaxBracket(double income, double amountPaid, double finalIncome, double[] rate, double[] seperateMarry) {
        super(income, rate, amountPaid, finalIncome);
        this.seperateMarry = seperateMarry;
    }
}
