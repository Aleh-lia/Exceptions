package HomeWork3.base;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message) {
        super("Exception in the loop, during parsing: " + message);
    }
}
