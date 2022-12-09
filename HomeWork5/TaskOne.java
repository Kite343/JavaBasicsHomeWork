import java.util.HashMap;

/*Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
*/

public class TaskOne {

    public HashMap<Integer, String> fillMap(HashMap<Integer, String> phoneBook) {
        phoneBook.put(123456, "Иванов");
        phoneBook.put(678907, "Васильев");
        phoneBook.put(456207, "Петрова");
        phoneBook.put(967431, "Иванов");
        phoneBook.put(120976, "Петрова");
        phoneBook.put(556677, "Иванов");
        phoneBook.put(886621, "Смирнов");
        phoneBook.put(808909, "Васильев");
        phoneBook.put(908908, "Петрова");
        phoneBook.put(987987, "Смирнова");
        phoneBook.put(765890, "Петрова");
        phoneBook.put(564786, "Смирнов");
        phoneBook.put(345234, "Смирнова");
        return phoneBook;
    }

    public void getNumbersfoByName(HashMap<Integer, String> phoneBook, String name){
        System.out.println(name);
        boolean flag = true;
        for(HashMap.Entry<Integer, String> number : phoneBook.entrySet()) {
            if (number.getValue().equals(name)) {
                flag = false;
                System.out.println(number.getKey());
            }
        }
        if(flag){System.out.println("Данного абонента нет в справочнике");}
    }
}
