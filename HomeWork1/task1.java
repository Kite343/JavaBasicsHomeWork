import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        SerialNum myObject = new SerialNum();
        myObject.triangularNum();
        myObject.factorial();
    }
}

class SerialNum {
    int n;

    SerialNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        n = input.nextInt();
        input.close();
    }

    void triangularNum(){
        System.out.println("Треугольное число " + n + " равно " + (n * (n + 1) / 2));
    }

    void factorial(){
        int nFact = 1;
        for(int i = 2; i <= n; i++ ) {nFact *= i;}
        System.out.println("Факториал числа " + n + " равен " + nFact);
    }

}