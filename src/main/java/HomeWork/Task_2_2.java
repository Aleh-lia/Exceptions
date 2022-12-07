package HomeWork;

public class Task_2_2 {
    public static void main(String[] args) {
        arr();
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }


    // Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void arr(){
        try {
            int[] intArr = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double cres = intArr[8] / d;
            System.out.println("cres = " + cres);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
