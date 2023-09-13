package ITEC2150.TaxBracket;

public class MarriedJointlyTaxBracket extends TaxBracket {
    private double[] jointMarryandWidow = {22000, 89450, 190750, 364200, 462500, 693750};

    public MarriedJointlyTaxBracket(double income, double[] rate, double[] jointMarryandWidow, double amountPaid, double finalIncome, double[] bracketPlaceholder) {
        super(income, rate, amountPaid, finalIncome, bracketPlaceholder);
        this.jointMarryandWidow = jointMarryandWidow;
    }
    public MarriedJointlyTaxBracket() {}

    @Override
    public void calculation() {
        super.setBracketPlaceholder(jointMarryandWidow);
        super.calculation();
    }
    public void display() {
        System.out.println("for your bracket of (married jointly)");
        super.display();
    }
    public double[] getJointMarryandWidow() {
        return jointMarryandWidow;
    }

    public void setJointMarryandWidow(double[] jointMarryandWidow) {
        this.jointMarryandWidow = jointMarryandWidow;
    }
}
