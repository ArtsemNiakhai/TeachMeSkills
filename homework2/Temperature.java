// Для t вывести: t>-5 - Warm; t <= -5>-20 - Normal; t <=-20 - Cold;

package homework2;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for t");
            int t = sc.nextInt();
            if(t >-5){
                System.out.println("Warm");
            } else if (t <=-5 && t >-20){
                System.out.println("Normal");
            } else if (t <=-20){
                System.out.println("Cold");
            }

        }
    }
}
