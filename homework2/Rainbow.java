// По введеному номеру определить цвет радуги

package homework2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int number = sc.nextInt();

            if (number == 1) {
                System.out.println("Red");
            } else if (number == 2) {
                System.out.println("Orange");
            } else if (number == 3) {
                System.out.println("Yellow");
            } else if (number == 4) {
                System.out.println("Green");
            } else if (number == 5) {
                System.out.println("Light Blue");
            } else if (number == 6) {
                System.out.println("Blue");
            } else if (number == 7) {
                System.out.println("Purple");
            } else {
                System.out.println("Wrong number");
            }

        }
    }
}
