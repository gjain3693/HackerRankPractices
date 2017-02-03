import java.lang.Runtime;

/**
 * Created by gauravp.jain on 1/18/2017.
 */
public class TestExe {

    public static void main(String args[]) {
        String str="E:\\PRF866\\P2PE\\Windows\\Integrated_Payment_Client_2-V2.1.6-P2PE.exe";

        try{
            Process p= Runtime.getRuntime().exec(str);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
