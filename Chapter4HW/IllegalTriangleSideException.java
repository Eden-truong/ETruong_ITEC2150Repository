package ITEC2150.Chapter4HW;

/**
 * class: IllegalTriangleSideException
 * author: Eden Truong
 * date: 09/27/2023
 * description: custom error handling for triangle sides
 */
public class IllegalTriangleSideException extends Exception{
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public IllegalTriangleSideException() {
        super("an Invalid side measurement have been provided");
    }

    public IllegalTriangleSideException(String message) {
        super(message);
    }

    //constructors
    public IllegalTriangleSideException(String message, int sideOne, int sideTwo, int sideThree) {
        super(message);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    //getters
    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }
}
