package HomeWork3.base;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);
    }
}
