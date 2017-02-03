/**
 * Created by gauravp.jain on 1/27/2017.
 */
public class IntToStringConversion {



    public static void main(String args[]) {
        int x=9;
        String str;

        if(x<=100 || x>=-100) {
            str = Integer.toString(x);

            System.out.println(str);
        }
    }
}
