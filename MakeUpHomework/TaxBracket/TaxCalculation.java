package ITEC2150.TaxBracket;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Single Filing");
        System.out.println("2. Married Separately Filing");
        System.out.println("3. Married Filing Jointly");
        System.out.println("4. Head Household Filing");
        System.out.print("Please input the Bracket that you belong to (1-4): ");
        int bracketIdentifier = sc.nextInt();
        System.out.println("\n");
        System.out.print("Please input your income: ");
        double incomeInput = sc.nextDouble();

        SingleTaxBracket singleTax = new SingleTaxBracket();
        MarriedSeparatelyTaxBracket marriedSeparate = new MarriedSeparatelyTaxBracket();
        HeadofHouseholdTaxBracket headHousehold = new HeadofHouseholdTaxBracket();
        MarriedJointlyTaxBracket marriedJointly = new MarriedJointlyTaxBracket();

        switch(bracketIdentifier) {
            case 1:
                singleTax.setIncome(incomeInput);
                singleTax.calculation();
                singleTax.display();
                break;
            case 2:
                marriedSeparate.setIncome(incomeInput);
                marriedSeparate.calculation();
                marriedSeparate.display();
                break;
            case 3:
                marriedJointly.setIncome(incomeInput);
                marriedJointly.calculation();
                marriedJointly.display();
                break;
            case 4:
                headHousehold.setIncome(incomeInput);
                headHousehold.calculation();
                headHousehold.display();
                break;
        }
    }
}
