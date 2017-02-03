/**
 * Created by gauravp.jain on 1/27/2017.
 */
public class TestDivisor {
    public static void main(String args[]){

        int a=6;
int d=0;
        int temp=0;
        int finalCount;
        for(int i=1;i<a;i++){

            if(a%i==0){
                temp=i;
                System.out.println("Value of divisor is::"+temp);
                d=d+temp;
            }

        }
        System.out.println("divisor"+a);
        finalCount=d+a;
        System.out.println("Total"+finalCount);

    }

}
