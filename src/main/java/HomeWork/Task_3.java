package HomeWork;


import java.util.Random;

public class Task_3 {

    public static void main(String[] args) {
        int[] oneArr = getFilledArr(10);
        int[] twoArr = getFilledArr(10);
    }

    public static int[] divArr(int[] oneArr, int[] twoArr) {
        int[] resultArr = new int[oneArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = oneArr[i] - twoArr[i];
        }
        return resultArr;
    }

    public static int[] getFilledArr(int length){
        int[] arr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt(20);
        }
        return arr;
    }



}
