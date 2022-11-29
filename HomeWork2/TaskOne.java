package HomeWork2;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
Первая задача: Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/WARNING.
*/  

public class TaskOne {
    public static void main(String[] args)  throws IOException {

        ArrayList <String> arrayLog = ReadFile("log.txt");

        System.out.println("Содержание исходного файла:");
        // System.out.println(arrayLog);
        PrintFile(arrayLog);
        System.out.println();

        System.out.println("записи уровня INFO:");
        System.out.println();
        CheckInfo(arrayLog, "INFO");
        System.out.println();

        System.out.println("записи уровня WARNING:");
        System.out.println();
        CheckInfo(arrayLog, "WARNING");
        System.out.println();

    }
    
    static ArrayList ReadFile(String name)  throws IOException {
        FileReader inFile = new FileReader(name);
        Scanner file = new Scanner(inFile);

        ArrayList <String> arrayLines = new ArrayList<>();;
        
        while (file.hasNextLine()) {
            String temp = file.nextLine();
            arrayLines.add(temp);
        }
        file.close();
        return arrayLines;
    }

    static void PrintFile(ArrayList <String> array) {
        for(String line : array) {
            System.out.println(line);
        }
    }

    static void CheckInfo(ArrayList <String> array, String msg) {
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i).contains(msg)) {
                System.out.println(array.get(i - 1));
                System.out.println(array.get(i));
            }
        }
    }
}
