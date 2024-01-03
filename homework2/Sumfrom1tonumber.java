//  Вводим число - программа суммирует все цифры от 1 до введенного числа

package homework2;

import java.util.Scanner;

public class Sumfrom1tonumber {

    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;

        }
        System.out.println("Your sum is  " + sum);

    }
}






