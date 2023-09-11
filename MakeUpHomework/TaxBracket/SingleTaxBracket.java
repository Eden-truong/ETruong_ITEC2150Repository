package ITEC2150.TaxBracket;

public class SingleTaxBracket extends TaxBracket {
    private double[] singleTax = {0, 11000, 44725, 95375, 182100, 231250, 578125};

    public SingleTaxBracket(double[] singleTax, double[] rate, double income, double finalIncome, double amountPaid) {
        super(income, rate, finalIncome, amountPaid);
        this.singleTax = singleTax;
    }
    public SingleTaxBracket(double income) {
        super(income);
    }

    public void taxCalculation(double income) {
        if(income < 0) {
            System.out.println("you broke lmao");
        }
//        if(income >= singleTax[0] && income < singleTax[1]) {
//            setAmountPaid(income * getRate()[0]);
//        }
//        else if(income >= singleTax[1] && income < singleTax[2]) {
//            setAmountPaid(income * getRate()[1]);
//        }
//        else if(income >= singleTax[2] && income < singleTax[3]) {
//            setAmountPaid(income * getRate()[2]);
//        }
//        else if(income >= singleTax[3] && income < singleTax[4]) {
//            setAmountPaid(income * getRate()[3]);
//        }
//        else if(income >= singleTax[4] && income < singleTax[5]) {
//            setAmountPaid(income * getRate()[4]);
//        }
//        else if(income >= singleTax[5] && income < singleTax[6]) {
//            setAmountPaid(income * getRate()[5]);
//        }
//        else {
//            setAmountPaid(income * getRate()[6]);
//        } i will try the function on the bottom, if it works it works the above one i know would work but this should be faster
        for(double i : singleTax) {
            int count = 0;
            if (income <= i) {
                setAmountPaid(income * getRate()[count + 1]);
            }
            count++;
        }
        setFinalIncome(income - getAmountPaid());
    } //addendum work on making this method a global method in tax bracket.

    public double[] getSingleTax() {
        return singleTax;
    }

    public void setSingleTax(double[] singleTax) {
        this.singleTax = singleTax;
    }
}
