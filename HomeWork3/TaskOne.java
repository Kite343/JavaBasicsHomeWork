/*Реализовать алгоритм сортировки слиянием */

// import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    int[] arrayList;
    
    public void mergeSorting(){
        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int num = in.nextInt();
        in.close();
        arrayList = fillArray(num);
        System.out.println("Задан массив:");
        printArray(arrayList);
        System.out.println("Отсортированный массив:");
        int[] arrayListSort = sortArray(arrayList);
        printArray(arrayListSort);
        System.out.println("Исходный массив:");
        printArray(arrayList);

    }

    public static int getRandomNum() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    public static int[] fillArray(int n) {

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = getRandomNum();  
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] array) {
        // окончание деления массива, остановка рекурсии, "обратная сборка":
        if (array.length < 2) {
            return array;
        }

        // делим список на две части - левую и правую
        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);
        int[] arrayRight = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);

        // С помощью рекурсии продолжаем делить список
        arrayLeft = sortArray(arrayLeft);
        arrayRight = sortArray(arrayRight);

        // отправляем полученные масcивы на сборку с сортировкой
        return mergeArray(arrayLeft, arrayRight);
    }

    public static int[] mergeArray(int[] arrayL, int[] arrayR) {
        int[] array = new int[arrayL.length + arrayR.length];
        int indL = 0; int indR = 0; int ind = 0;

        /* сравниваем первыe элементы левого и правого списка, меньший добавляем в результирующий список, 
        пока один из списков не закончится */ 
        while(indL < arrayL.length && indR < arrayR.length){
            array[ind++] = arrayL[indL] < arrayR[indR] ? arrayL[indL++] : arrayR[indR++];
        }

        // Оставшиеся элементы одного из списков добавляем в результирующий список
        while(indL < arrayL.length){
            array[ind++] = arrayL[indL++];
        }

        while(indR < arrayR.length){
            array[ind++] = arrayR[indR++];
        }
        
        return array;
    }
    
}
