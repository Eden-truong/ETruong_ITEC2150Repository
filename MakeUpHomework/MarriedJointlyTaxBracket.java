package ITEC2150.TaxBracket;

public class MarriedJointlyTaxBracket extends TaxBracket {
    private double[] jointMarryandWidow = {0, 22000, 89450, 190750, 364200, 462500, 693750};

    public MarriedJointlyTaxBracket(double income, double[] rate, double[] jointMarryandWidow, double amountPaid, double finalIncome) {
        super(income, rate, amountPaid, finalIncome);
        this.jointMarryandWidow = jointMarryandWidow;
    }
    public MarriedJointlyTaxBracket(double income) {
        super(income);
    } //income input
    public void taxCalculation(double income) {
        if(income <= 0) {
            System.out.println("you both broke lmao");
        }
        for(double i : jointMarryandWidow) {
            int count = 0;
            if(income <= i ) {
                setAmountPaid(income * getRate()[count + 1]);
            }
            count++;
        }
        setFinalIncome(income - getAmountPaid());
    }
    public double[] getJointMarryandWidow() {
        return jointMarryandWidow;
    }

    public void setJointMarryandWidow(double[] jointMarryandWidow) {
        this.jointMarryandWidow = jointMarryandWidow;
    }
}
