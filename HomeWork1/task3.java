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

    // Не работает, пробовала переносить в другие разделы, не помогает, не пойму как это реализовать
    // public static double getNum(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Введите число ");
    //     String text = input.next();
    //     input.close();
    //     try{
    //         double num = Double.parseDouble(text);
    //         return num;
    //     }
    //     catch(NumberFormatException e){
    //         return getNum();
    //     }
    // }

    Calk() {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Введите число ");
        // a = input.nextDouble();
        // System.out.println("Введите действие ");
        // action = input.next().charAt(0);
        // System.out.println("Введите число ");
        // b = input.nextDouble();
        // input.close();

        // пока удалась только такая реализация
        String text;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Введите число ");
            text = input.next();
            try{
                a = Double.parseDouble(text);
                break;
            }
            catch(NumberFormatException e){System.out.println("Вы ввели не число");} // Здесь текст?
        }
        System.out.println("Введите действие ");
        action = input.next().charAt(0);
        System.out.println("Введите число ");
        while(true){
            text = input.next();
            try{
                b = Double.parseDouble(text);
                break;
            }
            catch(NumberFormatException e){}
            System.out.println("Вы ввели не число"); // или здесь текст?
        }
        input.close();
        
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
            default: System.out.println("Выбранное действие невозможно, попробуйте заново");
                break;
        }
        
    }
}

