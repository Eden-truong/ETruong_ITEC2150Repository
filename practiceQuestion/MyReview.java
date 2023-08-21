package ITEC2150.practiceQuestion;

/**
 * class: MyReview
 * author: Eden Truong
 * date: 08/19/2023
 * version: 1.0
 * description: ITEC 2150 Practice about static methods.
 *
 */

public class MyReview {
    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    public static String reverseDoubleChar(String word){
        String result = "";
        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            result = result + word.charAt(i) + word.charAt(i) ;
        }
        return result;

    }

    public static String reverseDoubleChar2(String word){
        String result = "";
        for(int i = 0 ; i < word.length() ; i++)
        {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;

    }

    public static String reverseDoubleChar3(String word){
        String result = "";
        for(int i = word.length() - 1 ; i >= 0 ; i--)
        {
            result = result + word.charAt(i) + word.charAt(i) ;
        }
        return result;
    }
}
