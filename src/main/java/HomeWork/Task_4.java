package HomeWork;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[] oneArr = getFilledArr(10);
        int[] twoArr = getFilledArr(10);



        int[] divArr = divArr(oneArr, twoArr);
        printArr(divArr);


    }

    public static int[] divArr(int[] oneArr, int[] twoArr) {
        if(oneArr.length != twoArr.length) throw new RuntimeException("Длины массивов не равны!!!");
        int[] resultArr = new int[oneArr.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = oneArr[i]/twoArr[i];

        }

        return resultArr;
    }

    public static int[] getFilledArr(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,20);
        }
        return array;
    }

    public static void printArr(int[] arr){
        for (int n: arr){
            System.out.println(n);
        }
    }
}
