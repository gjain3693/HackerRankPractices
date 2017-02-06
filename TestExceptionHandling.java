import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by gauravp.jain on 2/6/2017.
 */
public class TestExceptionHandling {

    public static void main (String args[]){
        int x=9;
        Scanner scan=new Scanner(System.in);


            try {
                int y=scan.nextInt();

             int temp=x/y;
                System.out.println(temp);
            }catch(ArithmeticException aex) {
System.out.println("java.lang.ArithmeticException: / by zero");
            } catch (InputMismatchException inex) {
System.out.println("java.util.InputMismatchException");
            }

    }
}
