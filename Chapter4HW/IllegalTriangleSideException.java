package Chapter4HW;

/**
 * class: IllegalTriangleSideException
 * author: Eden Truong
 * date: 09/27/2023
 * description: custom error handling for triangle sides
 */
public class IllegalTriangleSideException extends Exception{

    public IllegalTriangleSideException() {
        super("an Invalid side measurement have been provided");
    }

    public IllegalTriangleSideException(String message) {
        super(message);
    }

}
