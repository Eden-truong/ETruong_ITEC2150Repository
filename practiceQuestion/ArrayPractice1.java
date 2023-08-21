package ITEC2150.practiceQuestion;

/**
 * class: ArrayPractice1
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice about array pt.1
 *
 */

public class ArrayPractice1 {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = {5, 10, 15, 20, 25};
            for(int i = 0; i < array.length; i ++) {
                sum += array[i];
            }
        System.out.println(sum);
    }
}
