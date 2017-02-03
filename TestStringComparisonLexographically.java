import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by gauravp.jain on 1/13/2017.
 */
public class TestStringComparisonLexographically {



    public static void main(String args[]) {
Scanner scan =new Scanner(System.in);
        String test=scan.nextLine();
        int counter=scan.nextInt();
        String f="";
        int x=counter-1;
        ArrayList<String> stringArrayList= new ArrayList<String>();
     for(int i=0;i<test.length()-x;i++) {
         f = test.substring(i, i + counter);
         stringArrayList.add(f);
        //System.out.println(f);
     }

        Collections.sort(stringArrayList);

//System.out.println(stringArrayList);
       System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.get(stringArrayList.size()-1));
    }

}
