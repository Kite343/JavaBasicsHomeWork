import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;


/*
К калькулятору из предыдущего дз добавить логирование.
 */

public class TaskFour {
    private static Logger logger = Logger.getLogger(TaskFour.class.getName());

    
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("logTaskFour.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.INFO, "Запуск программы");

        // logger.info("Запуск программы");

        Scanner in = new Scanner(System.in);

        double a;
        double b;
        char action;
        String text;

        while(true){
            System.out.println("Введите число ");
            text = in.next();
            try{
                a = Double.parseDouble(text);
                logger.log(Level.INFO, "Введено верное значение");
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Вы ввели не число");
                logger.log(Level.WARNING, "Введено не верное значение");
            }
        }

        System.out.println("Введите действие ");
        action = in.next().charAt(0);
        
        while(true){
            System.out.println("Введите число ");
            text = in.next();
            try{
                b = Double.parseDouble(text);
                logger.log(Level.INFO, "Введено верное значение");
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Вы ввели не число");
                logger.log(Level.WARNING, "Введено не верное значение");
            }
            
        }

        in.close(); 

        calkAction(a, b, action);
    }

    static void calkAction(double a, double b, char action) {
        switch(action) {
            case '+': System.out.println(a + b);
                break;
            case '-': System.out.println(a - b);
                break;
            case '*': System.out.println(a * b);
                break;
            case '/': 
                if (b == 0){
                    System.out.println("На ноль делить нельзя");
                    logger.log(Level.INFO, "Деление на ноль");}
                else {System.out.println(a / b);}
            default: System.out.println("Выбранное действие невозможно, попробуйте заново");
                logger.log(Level.WARNING, "Введено не верное действие");
                break;
        }
    }

    
}
