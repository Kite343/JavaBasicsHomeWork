/* *+Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/
import java.util.Scanner;

public class task4 {
    public task4() {

    }

    public static void main(String[] args) {
        int a, b, result;
        int[] coef = new int[2];
        System.out.println("Введите выражение типа: a?+?b=c");
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().replace(" ", "")
                                                                                .replace("+", " ")
                                                                                .replace("=", " ")
                                                                                .split(" ");
        input.close();
        a = convert(elements[0]);
        b = convert(elements[1]);
        result = Integer.parseInt(elements[2]);
        coef[0] = coefficient(elements[0]);
        coef[1] = coefficient(elements[1]);

        boolean flag = true;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j ++){
                if (i * coef[0] + j * coef[1] == result - a - b) {
                    System.out.printf("Искомыми значениями в уравнении %s+%s=%s являются %d и %d", elements[0], elements[1], elements[2], i, j);
                    System.out.println();
                    flag = false;
                }
            }
        }
        if (flag) {System.out.println("Решений нет");}
       
    }

    // Взято у одногрупника, далее мои коментарии
    static int convert(String msg){
            int num, i = msg.indexOf("?"); // i - определяем индекс ? в строке искомого числа
            if (i == 0){  // знак вопроса на первой позиции
                /*при вычитании одного символа из другого 
                получаем числовую разницу их номеров в таблице,
                 цифры идут от 0 до 9 => разница между числом и '0' будет равна искомому числу */
                num = msg.charAt(1) - '0'; 
                return num;
            }
            else { //знак вопроса на второй позиции
                num = (msg.charAt(0) - '0') * 10; 
                return num;
            }            
    }

    static int coefficient(String msg) {
        int i = msg.indexOf("?");
        if (i == 0) { return 10;}
        else {return 1;}
    }
}
