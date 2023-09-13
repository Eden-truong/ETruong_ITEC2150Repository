package ITEC2150.TaxBracket;

public class SingleTaxBracket extends TaxBracket {
    private double[] singleTax = {11000, 44725, 95375, 182100, 231250, 578125};

    public SingleTaxBracket(double[] singleTax, double[] rate, double income, double finalIncome, double amountPaid, double[] placeholderBracket) {
        super(income, rate, finalIncome, amountPaid, placeholderBracket);
        this.singleTax = singleTax;
    }
    public SingleTaxBracket() {}

//    public void taxCalculation(double income) {
//        if(income < 0) {
//            System.out.println("you broke lmao");
//        }
//        for(double i : singleTax) {
//            int count = 0;
//            if (income <= i) {
//                setAmountPaid(income * getRate()[count + 1]);
//            }
//            count++;
//        }
//        setFinalIncome(income - getAmountPaid());
//    } //addendum work on making this method a global method in tax bracket.
//      I did it, will leave this for reference <3

    @Override
    public void display() {
        System.out.println("for your bracket of (being absolutely single)");
        super.display();
    }
    public void calculation() {
        super.setBracketPlaceholder(singleTax);
        super.calculation();
    }
    public double[] getSingleTax() {
        return singleTax;
    }

    public void setSingleTax(double[] singleTax) {
        this.singleTax = singleTax;
    }
}
