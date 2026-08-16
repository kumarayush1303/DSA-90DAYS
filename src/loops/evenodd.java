package loops;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("How many integers to read: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0 , even = 0;
        for (int i = 1; i <n; i++) {
            System.out.println("Enter a value :");
            int num = sc.nextInt();
               if (num%2==1){
                   System.out.println(num+"is a odd number ");
                   odd+=num;
               }else {
                   System.out.println(num+ " is a even number");
                   even+=num;
               }
        }
        System.out.println("odd sum = " + odd +" and even sum = " + even);
    }
}
