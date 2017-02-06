/**
 * Created by gauravp.jain on 2/6/2017.
 */
public class TestCubeRootExceptionHandling {

    public static void main(String args[]){
        int n=3;
        int p=-5;
        int temp=1;

        try {
            if(p<0 || n<0){
                throw new Exception();
            } else {
                for (int i = 1; i <= p; i++) {
                    temp = temp * n;
                }
                System.out.println(temp);
            }
        } catch (Exception ex){
            System.out.println("java.lang.Exception: n and p should be non-negative");
        }
    }
}
