package ITEC2150.practiceQuestion;

/**
 * class: ArrayPractice2
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice about array pt.2
 *
 */

public class ArrayPractice2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int largeNumber = 0;
            for (int i = 0; i < array.length; i ++) {
                if(array[i] >= largeNumber) {
                    largeNumber = array[i];
                }
            }
        System.out.println(largeNumber);
    }
}
