/**
 * Created by gauravp.jain on 1/12/2017.
 */
import java.util.Scanner;
public class TestScanString {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan.next();
            s += scan.nextLine();


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }


