import java.util.Scanner;
import java.util.Stack;

public class TaskThree {

    Stack<Double> result = new Stack<>();
    
    public void taskTree(){      

        Scanner in = new Scanner(System.in);

        double a;
        double b;
        char action;
        String text = "start";

        do{ 
            if(text.equals("del")){
                if(!result.empty()){
                    result.pop();
                    System.out.println("Последняя операция удалена");
                    System.out.println();
                }
                else {
                    System.out.println("Предыдущие операции отсутствуют");
                    System.out.println();
                }
            }

            else{
                if(!result.empty()){a = result.peek();}
                else{
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

                calkAction(a, b, action);
                System.out.println("Результат "  + result.peek());
                System.out.println();
            }

            System.out.println("Введите Q для окончания работы программы,\ndel - для удаления последней операции\nЛюбой символ для продолжения");
            text = in.next();
            System.out.println();            
            
        } while(!text.equals("Q"));        

        in.close();         
    }

    void calkAction(double a, double b, char action) {
        
        switch(action) {
            case '+': 
                result.push(a + b);
                break;
            case '-': 
                result.push(a - b);
                break;
            case '*': 
                result.push(a * b);
                break;
            case '/': 
                if (b == 0){
                    System.out.println("На ноль делить нельзя");
                    break;
                }
                else {
                    result.push(a / b);}
            default: System.out.println("Выбранное действие невозможно, попробуйте заново");
                break;
        }
    }
}
