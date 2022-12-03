import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class TaskThree {
    public void taskThree(){
        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int num = in.nextInt();
        in.close();

        ArrayList<Integer> arrayNum = fillArray(num);
        printArray(arrayNum);

        minMaxMean(arrayNum);

    }

    public static int getRandomNum() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    public static ArrayList<Integer> fillArray(int n) {

        ArrayList<Integer> array = new ArrayList<>(n);;
        for (int i = 0; i < n; i++) {
            array.add(getRandomNum());  
        }
        return array;
    }

    public static void printArray(ArrayList<Integer> array) {
        for(int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void minMaxMean(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(0);
        int sum = 0;
        for(int n : array) {
            if(min > n){
                min = n;
            }
            else if (max < n){
                max = n;
            }
            sum += n;
        }

        System.out.println("Максимальное значение из списка = " + max + "\nМинимальное значение из списка = " + min + "\nСреднее значение списка = " + ((double)sum / array.size()));
    }


}
