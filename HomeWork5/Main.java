import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        TaskOne taskOne = new TaskOne();
        HashMap<Integer, String> phoneBook = taskOne.fillMap(new HashMap<>());
        taskOne.getNumbersfoByName(phoneBook, "Смирнов");
        System.out.println();
        taskOne.getNumbersfoByName(phoneBook, "Смирнова");
        System.out.println();
        taskOne.getNumbersfoByName(phoneBook, "Иванов");
        System.out.println();
        taskOne.getNumbersfoByName(phoneBook, "Ленин");
        System.out.println();

    }
}
