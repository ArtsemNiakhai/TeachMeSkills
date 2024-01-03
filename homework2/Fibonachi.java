// Вывести первые 11 членов последовательности Фибоначчи 0,1, 1,2,3, 5, 8, 13, 21,34,55

package homework2;

public class Fibonachi {

    public static void main(String[] args) {

        int n = 11;
        int firstnumber = 0;
        int secondnumber = 1;

        for (int i = 1; i <= n; i++) {

            System.out.println(firstnumber);

            int nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;

        }
    }
}

