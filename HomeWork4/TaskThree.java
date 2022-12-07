import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {      

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
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Вы ввели не число");
            }
        }

        System.out.println("Введите действие ");
        action = in.next().charAt(0);
        
        while(true){
            System.out.println("Введите число ");
            text = in.next();
            try{
                b = Double.parseDouble(text);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Вы ввели не число");
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
                }
                else {System.out.println(a / b);}
            default: System.out.println("Выбранное действие невозможно, попробуйте заново");
                break;
        }
    }
}
