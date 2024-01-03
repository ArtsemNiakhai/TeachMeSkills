//  10 первых чисел последовательности 0 -5 -10

package homework2;

public class Sequenceminusfive {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 1; i += -5) {
            sum++;
            if (sum <= 10) {

                System.out.println(i);
            }
        }
    }
}

