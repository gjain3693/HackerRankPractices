import java.util.*;

/**
 * Created by gauravp.jain on 1/23/2017.
 */
public class TEstCount {

    public static void main(String args[]) {
        String nameone="anagram";
        String nametwo="margann";
        Character charValue=' ';
        Character charValue2=' ';
        int newCount2=0;
int temp=0;
        Map<Character,Integer> ch=new HashMap<Character, Integer>();
        for( Character c:nameone.toCharArray()) {

            Integer counter=ch.get(c);
            int newCount=(counter==null?1:counter+1);
            ch.put(c,newCount);
            //System.out.println(ch.get(c));
        }

        Map<Character,Integer> ch2=new HashMap<Character, Integer>();
        for(Character c1:nametwo.toCharArray()) {

            Integer counter2=ch2.get(c1);
            newCount2=(counter2==null?1:counter2+1);
            ch2.put(c1,newCount2);
        }

        ch.forEach((k,v)->
        {
           // System.out.println(v+"YES");
        boolean b=(ch.get(k)==ch2.get(k))?true:false;
            System.out.println(ch.get(k)+" "+b+" "+ch2.get(k));
        });


          }


}
