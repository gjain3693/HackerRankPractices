import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by gauravp.jain on 1/23/2017.
 */
public class StringAnagram {

    public static void main(String args[]){
        String str;
        String atr;
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        atr = scan.next();
        str=str.toLowerCase();
        atr=atr.toLowerCase();
        int x = str.length();
        int g=atr.length();

        boolean b=false;
        Object key=null;
        Object value;
        Object nextKey=null;
        Object nextValue;

        int u=0;

        Map<Character,Integer> string1=new HashMap<Character, Integer>();
        Map<Character,Integer> string2=new HashMap<Character, Integer>();
        for(Character c1:str.toCharArray()){

            Integer counter=string1.get(c1);
            int count=(counter==null?1:counter+1);
            string1.put(c1,count);
        }
        for(Character c2:atr.toCharArray()){

            Integer counter=string2.get(c2);
            int count=(counter==null?1:counter+1);
            string2.put(c2,count);
        }


        if (x <= 50 && x==g) {

            Iterator iterator=string1.entrySet().iterator();
            while(iterator.hasNext()) {
                Map.Entry thisEntry=(Map.Entry) iterator.next();
                key=thisEntry.getKey();
                value=thisEntry.getValue();
                System.out.println(key+" "+value);
            }
            System.out.println("======");
            Iterator nowWhat=string2.entrySet().iterator();
            while(nowWhat.hasNext()) {
                Map.Entry nextEntry=(Map.Entry) nowWhat.next();
                nextKey=nextEntry.getKey();
                nextValue=nextEntry.getValue();
                System.out.println(nextKey+"----"+nextValue);
System.out.println();
                if(string1.get(key)==string2.get(nextKey)){
                    b=true;
                } else {
                    b=false;
                }
            }


            if(b){
                System.out.println("String is Anagram");
            } else {
                System.out.println("String is not Anagram");
            }

        } else {
            System.out.println("incorrect input ");
        }



    }
}
