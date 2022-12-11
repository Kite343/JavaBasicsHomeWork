package HomeWork6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("ASUS", "AS567", "white", 15.6f, 64, 2, "Linux", 32000);
        Notebook note2 = new Notebook("Lenovo", "ML987", "black", 13.6f, 128, 4, "Windows", 28000);
        Notebook note3 = new Notebook("Digma", "KI543", "white", 13.3f, 128, 4, "Linux", 23000);
        Notebook note4 = new Notebook("ASUS", "IU456", "black", 14.4f, 64, 4, "Windows", 30000);
        Notebook note5 = new Notebook("Apple", "AP123", "black", 12.8f, 256, 12, "macOS", 100000);
        Notebook note6 = new Notebook("Apple", "AP987", "gray", 12.8f, 128, 8, "macOS", 80000);
        Notebook note7 = new Notebook("Lenovo", "LI487", "white", 14.4f, 64, 4, "Linux", 25000);
        Notebook note8 = new Notebook("ASUS", "AS555","gray", 14.2f, 128, 8, "Linux", 40000);
        Notebook note9 = new Notebook("Apple", "AP666", "white", 15.6f, 256, 12, "macOS", 90000);
        Notebook note10 = new Notebook("Digma", "DI567", "black", 15.2f, 64, 2, "Linux", 26000);
        Notebook note11 = new Notebook("Lenovo", "LE777", "black", 16.2f, 256, 8, "Windows", 70000);
        Notebook note12 = new Notebook("ASUS", "AS333", "white", 15.6f, 128, 4, "Windows", 45000);

        HashSet<Notebook> noteSet = new HashSet<>();
        noteSet.add(note1);
        noteSet.add(note2);
        noteSet.add(note3);
        noteSet.add(note4);
        noteSet.add(note5);
        noteSet.add(note6);
        noteSet.add(note7);
        noteSet.add(note8);
        noteSet.add(note9);
        noteSet.add(note10);
        noteSet.add(note11);
        noteSet.add(note12);

        printInfo(noteSet);

        selectNote(noteSet);
    }

    public static void printInfo(HashSet<Notebook> set){
        for (Notebook elem : set) {
            System.out.println(elem.getInfo());
            System.out.println();
        }
    }

    public static void selectNote(HashSet<Notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите по какому критерию необходимо отобрать ноутбуки:\n" +
                            "1 - производитель\n" +
                            "2 - цвет\n" +
                            "3 - диагональ\n" +
                            "4 - объем жесткого диска\n" +
                            "5 - объем оперативной памяти\n" +
                            "6 - операционна система");
        int command = in.nextInt();
        if(command == 1){
            selectCompany(setNote);
        }
        else if(command == 2){
            selectColor(setNote);
        }
        else if(command == 3){
            selectDiagonal(setNote);
        }
        else if(command == 4){
            selectHardDriveV(setNote);
        }
        else if(command == 5){
            selectRamV(setNote);
        }
        else if(command == 6){
            selectOs(setNote);
        }
    }

    public static void selectCompany(HashSet<Notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную компанию:\n" +
                            "1 - ASUS\n" +
                            "2 - Lenovo\n" +
                            "3 - Digma\n" +
                            "4 - Apple\n");
        int n = in.nextInt();
        HashMap<Integer, String> comp = new HashMap<Integer, String>();
        comp.put(1, "ASUS");
        comp.put(2, "Lenovo");
        comp.put(3, "Digma");
        comp.put(4, "Apple");
        int i = 1;
        for (Notebook elem : setNote) {
            if(elem.getCompany().equals(comp.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    private static void selectColor(HashSet<Notebook> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужный цвет:\n" +
                            "1 - белый\n" +
                            "2 - черный\n" +
                            "3 - серый\n");
        int n = in.nextInt();
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "white");
        color.put(2, "black");
        color.put(3, "gray");
        int i = 1;
        for (Notebook elem : setNote) {
            if(elem.getColor().equals(color.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }        
    }
    
    public static void selectDiagonal(HashSet<Notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную диагональ:\n" +
                            "1 - 12 - 13 дюймов\n" +
                            "2 - 13 - 14 дюймов\n" +
                            "3 - 14 - 15 дюймов\n" +
                            "4 - свыше 15 дюймов\n");
        int n = in.nextInt();
        HashMap<Integer, float[]> diagonal = new HashMap<Integer, float[]>();
        diagonal.put(1, new float[] {12.0f, 13.0f});
        diagonal.put(2, new float[] {13.0f, 14.0f});
        diagonal.put(3, new float[] {14.0f, 15.0f});
        diagonal.put(4, new float[] {15.0f, 100.0f});
        int i = 1;
        for (Notebook elem : setNote) {
            if(diagonal.get(n)[0] < elem.getDiagonal() && elem.getDiagonal() < diagonal.get(n)[1]){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }
    
    public static void selectHardDriveV(HashSet<Notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём жесткого диска:\n" +
                            "1 - 64Гб\n" +
                            "2 - 128ГБ\n" +
                            "3 - 256\n" );
        int n = in.nextInt();
        HashMap<Integer, Integer> hardDrive = new HashMap<Integer, Integer>();
        hardDrive.put(1, 64);
        hardDrive.put(2, 128);
        hardDrive.put(3, 256);
        int i = 1;
        for (Notebook elem : setNote) {
            if(elem.getHardDriveV() == hardDrive.get(n)){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }
    
    public static void selectRamV(HashSet<Notebook> setNote){
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём оперативной памяти:\n" +
                            "1 - 2Гб\n" +
                            "2 - 4ГБ\n" +
                            "3 - 8ГБ\n" +
                            "4 - 12ГБ\n" );
        int n = in.nextInt();
        HashMap<Integer, Integer> ram = new HashMap<Integer, Integer>();
        ram.put(1, 2);
        ram.put(2, 3);
        ram.put(3, 8);
        ram.put(4, 12);
        int i = 1;
        for (Notebook elem : setNote) {
            if(elem.getRAMvol() == ram.get(n)){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }
    }

    private static void selectOs(HashSet<Notebook> setNote) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите операционную систему:\n" +
                            "1 - Windows\n" +
                            "2 - Linux\n" +
                            "3 - macOS\n");
        int n = in.nextInt();
        HashMap<Integer, String> os = new HashMap<Integer, String>();
        os.put(1, "Windows");
        os.put(2, "Linux");
        os.put(3, "macOS");
        int i = 1;
        for (Notebook elem : setNote) {
            if(elem.getOS().equals(os.get(n))){
                System.out.println(i++);
                System.out.println(elem.getInfo());
                System.out.println();
            }
        }        
    }
}
