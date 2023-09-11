package ITEC2150.TaxBracket;

public class TaxCalculation {
    public static void main(String[] args) {
        SingleTaxBracket sT = new SingleTaxBracket(16000);
        sT.taxCalculation(16000);
        System.out.println(sT.getAmountPaid());
        System.out.println(sT.getFinalIncome());
    }
}
