/**
 * Created by gauravp.jain on 1/27/2017.
 */

abstract class book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class TestExtends extends book {
    void setTitle(String s) {
        title=s;
    }

}

public class TestAbstract {

public static  void main (String args[]){
    TestExtends testExtends=new TestExtends();
    testExtends.setTitle("Hacker Rank");
    System.out.println("The title is:"+testExtends.getTitle());
}
}
