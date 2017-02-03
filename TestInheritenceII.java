/**
 * Created by gauravp.jain on 1/27/2017.
 */

class Arthematic{
    int add(int x,int y){
        return x+y;
    }
}


class TestInheritenceII extends Arthematic{
    public static void main(String args[]){
        System.out.println("My superclass is: Arithmetic");
        Arthematic arthematic=new Arthematic();
        arthematic.add(42,13);
    }
}





