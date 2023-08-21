package ITEC2150.practiceQuestion;

/**
 * class: MethodPractice
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice about Methods.
 *
 */

public class MethodPractice {
    public int calculateSquare(int x) {
        return x*= x;
    }
    public String printName(String name) {
        return "Hi " + name + "! You're pretty cool!";
    }

    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        System.out.println(mp.calculateSquare(2));
        System.out.println(mp.printName("edelynn"));
    }
    //fix all file names
}
