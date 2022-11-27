import java.util.Scanner;

public class task3new {
    public task3new(){

    } 

    public static void main(String[] args){
        double a;
        double b;
        char action;
        
        a = getNum();
        System.out.println("Введите действие ");
        Scanner input = new Scanner(System.in);
        action = input.next().charAt(0);
        // при раскомиченом input.close(); ошибка Exception in thread "main" java.util.NoSuchElementException ищу решение проблемы
        // в гугле говорят нужен один Scanner input = new Scanner(System.in); не могу найти куда его вставить, чтоб работало
        // input.close(); 
        b = getNum();

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

    static double getNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        String text = input.next();
        // / при раскомиченом input.close(); ошибка Exception in thread "main" java.util.NoSuchElementException ищу решение проблемы
        // input.close();
        try{
            double num = Double.parseDouble(text);
            return num;
        }
        catch(NumberFormatException e){
            return getNum();
        }
    
    }
}
