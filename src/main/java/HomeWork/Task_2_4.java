package HomeWork;

import java.util.Random;

public class Task_2_4 {
    public static void main(String[] args) {
//        int[] oneArr = getFilledArr(10);
        int[] oneArr ={2, 8, 5, 6, 5, 6, 9, 3, 7, 7};
        int[] twoArr = getFilledArr(10);

        System.out.println(oneArr);



        int[] divArr = divArr(oneArr, twoArr);
        printArr(divArr);


    }

    public static int[] divArr(int[] oneArr, int[] twoArr) {
        if(oneArr.length != twoArr.length) throw new RuntimeException("Длины массивов не равны!!!");
        int[] resultArr = new int[oneArr.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = oneArr[i] - twoArr[i];

        }

        return resultArr;
    }

    public static int[] getFilledArr(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,10);
        }
        return array;
    }

    public static void printArr(int[] arr){
        for (int n: arr){
            System.out.println(n);
        }
    }
}
