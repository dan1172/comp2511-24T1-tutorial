package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int x = 5;
        Scanner s = new Scanner(System.in);
        
        String nums;
        nums = s.nextLine();

        String splitNums[] =  nums.split(" ");

        // 5 8 22 1 --> ["5", "8", "22", "1"]
        int sum = 0;
        // for (int i = 0; i < splitNums.length; i++) {
        //     sum = sum + Integer.parseInt(splitNums[i]);
        // } 

        for (String x : splitNums) {
            sum = sum + Integer.parseInt(x);
        } 
        System.out.println(sum);


        s.close();
    }
}
