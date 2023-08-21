package ITEC2150.practiceQuestion;

/**
 * class: LoopPrac2
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice about loop pt.2
 *
 */

import java.util.Scanner;

public class LoopPrac2 {
    public static void main(String[] args) {
        int input = 0;
        int sum = 0;
        Scanner conIn = new Scanner(System.in);
        do {
            System.out.println("Please enter a number!");
            input = conIn.nextInt();
                if (input >= 0) {
                    System.out.println(input);
                    sum += input;
                }
                else if (input < 0 ) {
                    System.out.println(input);
            }
        } while (input >= 0);
        System.out.println(sum);
    }
}
