package ITEC2150.TaxBracket;

public class TaxBracket {
    private double[] rate = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
    private double income;
    private double amountPaid;
    private double finalIncome;
    private double[] bracketPlaceholder;
    private int bracketIndex = 0;

    public TaxBracket(double income) {
        this.income = income;
    }

    public TaxBracket(double income, double[] rate, double amountPaid, double finalIncome, double[] bracketPlaceholder) {
        this.income = income;
        this.rate = rate;
        this.amountPaid = amountPaid;
        this.finalIncome = finalIncome;
        this.bracketPlaceholder = bracketPlaceholder;
    }

    public TaxBracket() {}

    public void calculation() {
        for (double amitysBracket : bracketPlaceholder) {

            if(amitysBracket <= income) {
                bracketIndex++;
            }

            setAmountPaid(income * getRate()[bracketIndex]);
//            else if(income > bracketPlaceholder[bracketPlaceholder.length - 1]) {
//                setAmountPaid(income * getRate()[rate.length - 1]);
//            } what i did here is short of geniusness
        }
        setFinalIncome(income - getAmountPaid());
    }

    public void display() {
        if(income < 0) {
            System.out.println("Sorry you are broke.");
        }
        else {
            System.out.print("With a rate of: " + getRate()[bracketIndex] * 100 + "%");
            System.out.println('\n');
            System.out.println("You will pay " + getAmountPaid());
            System.out.println("Your final Income will be " + getFinalIncome());
        }
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

    public double[] getBracketPlaceholder() {
        return bracketPlaceholder;
    }

    public void setBracketPlaceholder(double[] bracketPlaceholder) {
        this.bracketPlaceholder = bracketPlaceholder;
    }
}
