import java.util.Scanner;

/**
 * Created by gauravp.jain on 2/3/2017.
 */
public class TestStaticBlock {

    static {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int temp;
        try{
            if(x<0 || y<0){
                throw new Exception();
            }
            temp=x*y;
System.out.println(temp);
        }catch(Exception ex){
System.out.println("Breadth and height must be positive");
        }
    }
        public static void main(String args[]){

    }

}
