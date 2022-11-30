import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;



/*
 *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

public class TaskTwo {
    private static Logger logger = Logger.getLogger(TaskTwo.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("logTaskTwo.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.info("Запуск программы");

        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int n = in.nextInt();
        in.close();

        int[] myArray = fillArray(n);
        printArray(myArray); 

        myArray = bubbleSort(myArray);  // сортировка массива
        System.out.println("Отсортированный массив");
        printArray(myArray);    // печать отсортированного массива
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

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = getRandomNum();  
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            logger.info("Итерация " + (i + 1));
            int count = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    logger.info("Поменяли местами элементы " + j + " и " + (j + 1));
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
            logger.info("Конец итерации " + (i + 1) + ", всего изменений " + count);
        }
        return array;
    }


}
