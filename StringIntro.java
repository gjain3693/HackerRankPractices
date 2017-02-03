import java.util.Scanner;

/**
 * Created by gauravp.jain on 1/20/2017.
 */
public class StringIntro {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        String B=scan.next();
        char ch=' ';
        char c=' ';
        int x=A.length()+B.length();
        System.out.println(x);
        int b=A.compareTo(B);
        ch = A.charAt(0);
        c=B.charAt(0);
        int val=ch;
        int val2=c;
        ch = Character.toUpperCase(ch);

        A = A.substring(1);
        A = ch + A;


        c=Character.toUpperCase(c);

        B=B.substring(1);
        B=c+B;
        if(val>val2) {

           System.out.println("Yes");
        } else {

            System.out.println("No");

        }
        System.out.println(A+" "+B);
            }


        }



