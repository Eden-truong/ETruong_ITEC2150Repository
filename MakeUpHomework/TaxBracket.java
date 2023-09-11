package ITEC2150.TaxBracket;

public class TaxBracket {
//    private boolean singleTax;
//    private boolean headHousehold;
//    private boolean jointMarryandWidow;
//    private boolean seperateMarry;
    private double[] rate = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
    private double income;
    private double amountPaid;
    private double finalIncome;

    public TaxBracket(double income) {
        this.income = income;
    }
    public TaxBracket(double income, double[] rate, double amountPaid, double finalIncome) {
        this.income = income;
        this.rate = rate;
        this.amountPaid = amountPaid;
        this.finalIncome = finalIncome;
    }

    public double[] getRate() {
        return rate;
    }

    public void setRate(double[] rate) {
        this.rate = rate;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getFinalIncome() {
        return finalIncome;
    }

    public void setFinalIncome(double finalIncome) {
        this.finalIncome = finalIncome;
    }
}
