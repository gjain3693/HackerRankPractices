import java.util.Scanner;

/**
 * Created by gauravp.jain on 1/19/2017.
 */
public class TestpalinDrome {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String A=scan.next();
        String reverse="";
        int counter=0;
        int x=A.length();

        for(int j=0;j<x;j++) {

        if(Character.isLowerCase(A.charAt(j))) {
         counter++;
         System.out.println(counter);
            }
        }
        if(counter<=50) {
            for (int i = x - 1; i >= 0; i--) {
                reverse = reverse + A.charAt(i);

            }

            if (A.equals(reverse)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("EXIT");
        }
    }
}
