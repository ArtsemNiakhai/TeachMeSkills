// Вывод названия поры года по месяцу при помощи if - else - if

package homework2;

public class Seasonsecond {

    public static void main(String[] args) {

        int NumberOfMonth = 4;

        if (NumberOfMonth >= 1 && NumberOfMonth <= 2) {
            System.out.println("Winter");
        } else if (NumberOfMonth >= 3 && NumberOfMonth <= 5) {
            System.out.println("Spring");
        } else if (NumberOfMonth >= 6 && NumberOfMonth <= 8) {
            System.out.println("Summer");
        } else if (NumberOfMonth >= 9 && NumberOfMonth <= 11) {
            System.out.println("Autumn");
        } else if (NumberOfMonth == 12) {
            System.out.println("Winter");
        } else if (NumberOfMonth <= 0) {
            System.out.println("Wrong number");
        } else if (NumberOfMonth > 12) {
            System.out.println("Wrong number");
        }

    }
}
