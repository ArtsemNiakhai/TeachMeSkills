// таблица умножения

package homework2;

import java.util.Scanner;


public class Multiplicationtable {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter number ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + "*" + i + "=" + number * i);
            }
        }
    }
}
