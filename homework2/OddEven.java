// Программа принимает на ввод число, и на выход выводит : четное или нет

package homework2;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Number");

            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        }
    }
}
