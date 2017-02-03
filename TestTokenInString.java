import java.util.StringTokenizer;

/**
 * Created by gauravp.jain on 1/13/2017.
 */
public class TestTokenInString {

    public static void main(String args[]) {
        String str="He is a very very good boy, isn't he?";
        String str2=" ,'?!";
        StringTokenizer stringTokenizer1=new StringTokenizer(str,str2);
        System.out.println(stringTokenizer1.countTokens());
        while(stringTokenizer1.hasMoreElements()) {

            System.out.println(stringTokenizer1.nextElement());
        }
    }
}
