import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



/*
 Пусть дан список сотрудников:Иван Иванов 
 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 Отсортировать по убыванию популярности.
 */

public class TaskTwo {

    public void taskTwo(){
        ArrayList<String> names = fillArray();
        printArray(names);
        
        HashMap <Integer, ArrayList<String>> namesCount = countingNames(names); 
        printSortNames(namesCount);
    }

    public ArrayList<String> fillArray(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("Иван Иванов");
        array.add("Александр Потапов");
        array.add("Алексей Пушкин");
        array.add("Юрий Гагарин");
        array.add("Иван Смирнов");
        array.add("Антон Чехов");
        array.add("Александр Иванов");
        array.add("Лев Толстой");
        array.add("Алексей Демидов");
        array.add("Иван Морозов");
        array.add("Михаил Булгаков");
        array.add("Александр Сидоров");
        array.add("Иван Плетнёв");
        array.add("Михаил Лермонтов");
        array.add("Юрий Викулов");
        array.add("Александр Романов");
        
        return array;
    }

    public void printArray(ArrayList<String> array){
        for(String c : array){
            System.out.println(c);
        }
        System.out.println();
    }

    public HashMap <Integer, ArrayList<String>> countingNames(ArrayList<String> array){
        array = selectNames(array);
        // System.out.println(array);
        HashMap <Integer, ArrayList<String>> hashMap = new HashMap<Integer, ArrayList<String>>();
        for (String name : array) {

            int col = Collections.frequency(array, name); 

            if (!hashMap.containsKey(col)) {
                ArrayList<String> arrayNames = new ArrayList<>();
                arrayNames.add(name);
                hashMap.put(col, arrayNames);
                
            } else if (hashMap.containsKey(col) && !hashMap.get(col).contains(name)) {
                hashMap.get(col).add(name);
            }
        }

        return hashMap;
    }

    public ArrayList<String> selectNames(ArrayList<String> array){
        ArrayList<String> select = new ArrayList<String>();
        for(String c : array){
            select.add(c.split(" ")[0]);
        }
        return select;
    }

    public void printSortNames(HashMap <Integer, ArrayList<String>> namesC){
        
        ArrayList<Integer> keys = new ArrayList<Integer>();
        keys.addAll(namesC.keySet());
        // System.out.println(keys);
        Collections.sort(keys, Collections.reverseOrder());
        
        for(int n : keys){
            System.out.println("Количество " + n);
            Collections.sort(namesC.get(n));
            for(String name: (namesC.get(n))){
                System.out.println(name);
            }
            System.out.println();
        }
    }
    
}
