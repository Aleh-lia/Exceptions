package HomeWork3.base;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Wrong number of elements in the entered data!");
    }
}
