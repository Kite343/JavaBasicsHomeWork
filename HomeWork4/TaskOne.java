import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

public class TaskOne{

    public void taskOne() {
        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int num = in.nextInt();
        in.close();

        LinkedList<Integer> arrayNum = fillArray(num);
        printArray(arrayNum);
        
        arrayNum = reverseArray(arrayNum);
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

    public static LinkedList<Integer> fillArray(int n) {

        LinkedList<Integer> array = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            array.add(getRandomNum());  
        }
        return array;
    }

    public static void printArray(LinkedList<Integer> array) {
        for(int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }


    // Вариант 1
    // public static LinkedList<Integer> reverseArray(LinkedList<Integer> array) {
    //     LinkedList<Integer> result = new LinkedList<>();
    //     for(int n : array){
    //         result.addFirst(n);
    //     }

    //     return result;
    // }

    // Вариант 2
    public static LinkedList<Integer> reverseArray(LinkedList<Integer> array) {
        LinkedList<Integer> result = new LinkedList<>();
        /* для обратного прохода необходимо установить итератор в последнюю позицию, "за пределы" (array.size()),
         иначе код ничего не выдаст, так как итератор находится на первой позиции (на 0 индексе), и перед ним ни чего нет
        */
        ListIterator<Integer> listIter = array.listIterator(array.size());

        while(listIter.hasPrevious()){
            result.add(listIter.previous());
        }

        return result;
    }

}