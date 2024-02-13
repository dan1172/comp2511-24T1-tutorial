package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
    
        String[] nums = string.split(" ");
        int res = 0;
        for (String i : nums) {
            res += Integer.parseInt(i);
        }
        System.out.println("The sum is" + res);

        s.close();
    }
}
