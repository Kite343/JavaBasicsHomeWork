/*Пусть дан произвольный список целых чисел, удалить из него четные числа */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskTwo {

    public void delEvenNums(){
        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int num = in.nextInt();
        in.close();

        ArrayList<Integer> arrayNum = fillArray(num);
        printArray(arrayNum);

        arrayNum = delNums(arrayNum);
        printArray(arrayNum);

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
    
    public static ArrayList<Integer> delNums(ArrayList<Integer> array){
        int i = 0;
        while(i < array.size()){
            if(array.get(i) % 2 == 0){
                array.remove(i);
            }
            else{i++;}
            
        }
        
        return array;
    }
}
