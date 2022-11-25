import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Calk myObject = new Calk();
        myObject.calkAction();
    }
}

class Calk {

    double a;
    double b;
    char action;

    Calk() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите число ");
            a = input.nextDouble();
            System.out.println("Введите действие ");
            action = input.next().charAt(0);
            System.out.println("Введите число ");
            b = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Неверный ввод");
            System.out.println(e.getMessage());
        }
        finally {
            // найдено и утащено с простовров интернета:
            // при закрытии потока тоже возможно исключение, например, если он не был открыт, поэтому “оборачиваем” код в блок try
                try {
                    input.close();;
            // пишем обработку исключения при закрытии потока чтения
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
    }

    void calkAction() {
        switch(action) {
            case '+': System.out.println(a + b);
                break;
            case '-': System.out.println(a - b);
                break;
            case '*': System.out.println(a * b);
                break;
            case '/': 
                // не удалось добавить try - catch, не срабатывает 
                if (b == 0){System.out.println("На ноль делить нельзя");}
                else {System.out.println(a / b);}
            default: System.out.println("Выбранного действия не существует");
                break;
        }
        
    }
}