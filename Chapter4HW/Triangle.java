package ITEC2150.Chapter4HW;

/**
 * class: Triangle
 * author: Eden Truong
 * date: 09/27/2023
 * description: homework that throws a custom exception
 */

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    //vars

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }  //constructor

    boolean checkSides() throws IllegalTriangleSideException { //checksides here throws an exception if occured
        if(sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne && sideOne + sideThree > sideTwo) {
            return true;
        }
        else {
            throw new IllegalTriangleSideException("each two sides adding together must be higher than the third side"); //this will print
        }
    }
    public static void main(String[] args) throws IllegalTriangleSideException {
        Triangle triangle1 = new Triangle(1,2,3);
        System.out.println(triangle1.checkSides()); //test
    }
}
