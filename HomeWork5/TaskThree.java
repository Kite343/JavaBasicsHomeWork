import java.util.HashMap;

public class TaskThree {
    // До 3999
    public String romanNumber (int num){
        HashMap<Integer, String> intRoman = new HashMap<Integer, String>();
        fillMap(intRoman);
        // System.out.println(intRoman);
        String romanNum = "";
        int n;
        int i = 0;
        String temp = "";
        while(num > 0){
            // (int) Math.pow(10, i)
            n = num % 10;
            if(n <= 3){
                for(int k = 0; k < n; k++){
                    temp = temp + intRoman.get(1 * (int) Math.pow(10, i));
                }
            }
            else if(n == 4){
                temp = intRoman.get(1 * (int) Math.pow(10, i)) + intRoman.get(5 * (int) Math.pow(10, i));
            }
            else if (n <= 8){
                temp = intRoman.get(5 * (int) Math.pow(10, i));
                for(int k = 0; k < n - 5; k++){
                    temp = temp + intRoman.get(1 * (int) Math.pow(10, i));
                }
            }
            else if(n == 9){
                temp = intRoman.get(1 * (int) Math.pow(10, i)) + intRoman.get(1 * (int) Math.pow(10, i + 1));
            }
            romanNum = temp + romanNum;
            temp = "";

            i++;
            num = num / 10;
        }
        return romanNum;
    }

    public HashMap<Integer, String> fillMap(HashMap<Integer, String> nums){
        nums.put(1, "I");
        nums.put(5, "V");
        nums.put(10, "X");
        nums.put(50, "L");
        nums.put(100, "C");
        nums.put(500, "D");
        nums.put(1000, "M");

        return nums;
    }
}
