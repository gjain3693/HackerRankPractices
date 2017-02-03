import java.util.Scanner;

/**
 * Created by gauravp.jain on 2/1/2017.
 */
public class TestSTDIN {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i =scan.nextInt();
        double  d=scan.nextDouble();
        String str=scan.nextLine();
        str+=scan.nextLine();
        System.out.println("String is: "+str);
        System.out.println("Double is: "+d);
        System.out.println("Int is: "+i);
    }
}