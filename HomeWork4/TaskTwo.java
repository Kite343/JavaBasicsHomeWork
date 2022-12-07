import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
 *Реализуйте очередь с помощью LinkedList со следующими методами: 
 enqueue() - помещает элемент в конец очереди, 
 dequeue() - возвращает первый элемент из очереди и удаляет его, 
 first() - возвращает первый элемент из очереди, не удаляя.
 */

public class TaskTwo {
    
    LinkedList<Integer> arrayNum = new LinkedList<Integer>();

    public void taskTwo(){
        System.out.print("Введите размер числового массива: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int num = in.nextInt();
        in.close();

        arrayNum = fillArray(num);
        printArray(arrayNum);
        System.out.println();

        System.out.println("Добавим элемент в конец очереди: ");
        enqueue(getRandomNum());
        
        printArray(arrayNum);
        System.out.println();

        System.out.println("Возьмем первый элемент очереди и удалим его: ");
        System.out.println(dequeue());

        System.out.println("Теперь первый элемент  в очереди: ");
        System.out.println(first());

        printArray(arrayNum);
        System.out.println();
        
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

    public void enqueue(int n){
        arrayNum.add(n);
        // arrayNum.addLast(n);
    }
    
    public int dequeue(){
        int temp = arrayNum.get(0);
        LinkedList<Integer> array = new LinkedList<>();
        for(int i = 1; i < arrayNum.size(); i++){
            array.add(arrayNum.get(i));
        }
        arrayNum = array;

        // второй вариант
        // int temp = first();
        // arrayNum.removeFirst();

        return temp;

        // третий вариант
        // return arrayNum.pollFirst();

    }

    public int first(){
        return arrayNum.get(0);
        // return arrayNum.getFirst();
    }
}
