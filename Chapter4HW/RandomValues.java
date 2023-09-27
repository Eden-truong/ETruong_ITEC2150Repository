package Chapter4HW;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class: RandomValues
 * author: Eden Truong
 * date: 09/26/2023
 * description: makes 50 random values, index is then added which point towards the assigned value
 */

public class RandomValues {
    public static void main(String[] args) {
        //you actually don't need an arrayList lol
        //List<Double> fiftyValues = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        double[] fiftyValues = new double[50];
        int index;
        double rand; // will need to cast to int to get rid of decimals


        for(int i = 0; i < fiftyValues.length; i++) {
            rand = Math.random() * 1000;
            fiftyValues[i] = (int)rand;
        }
        //for(double iteration : fiftyValues) {
        //    rand = Math.random() * 1000; //now it will give random numbers per iteration
        //    iteration = (int)rand;
        //} this don't work (NEVERMIND THIS WOULD WORK I JUST CAN'T PRINT OUT THE WHOLE THING bruh) will use a normal for loop for now.

        for(int i = 0; i < fiftyValues.length; i ++) {
            try {
                while(true) {
                    System.out.print("50 Values in an array have been generated, please enter an index to print the value (1-50):");
                    index = input.nextInt();
                    System.out.println(fiftyValues[index - 1]);
                    break;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                input.nextLine();
                System.out.println("sorry you have encountered an out of bounds error (entered something larger than 50 or lower than 1)");
            } catch(InputMismatchException e) {
                input.nextLine();
                System.out.println("sorry you entered an invalid type");
            }
        }


    }
}
