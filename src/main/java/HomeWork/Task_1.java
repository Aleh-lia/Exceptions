package HomeWork;

public class Task_1 {
    public static void main(String[] args){
        String[] sArray = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};

//        System.out.println(nol(15, 0));
        trouble(25, 0);
        valueByIndex(array,12);
        stringArray(sArray);
    }

    public static int nol(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("нельзя делить на ноль");
        }
        return a / b;
    }

    private static void trouble(int a, int b) {
        int x;
        try {
            x = a / b;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя!");
        }
    }

        // out of bounds
    public static void valueByIndex(int[] array, int index){
            if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
            else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

        // Null pointer exception
    public static void stringArray(String[] sArray){
            for (String i: sArray){
                if(i == null) throw new NullPointerException("Элемент отсутствует!!!");
                System.out.println(i);
            }
    }





}
