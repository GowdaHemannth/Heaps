import java.util.ArrayList;

public class Step3 {
    // In these We are going to How can we Insert An Element Into the Heap;

    static class Heap{
        // Here we are Representimg How to ADD THE Element 
        ArrayList<Integer>AL=new ArrayList<>();

        public void Insert(int data){
            AL.add(data);
            int x=AL.size()-1;
            int par=(x-1)/2;
            while(AL.get(x)<AL.get(par)){
              int Temp=AL.get(x);
              AL.set(x, AL.get(par));
              AL.set(par,AL.get(x));
              x=par;
              par=(x-1)/2;
            }

        }
    }
    public static void main(String [] args){
        //
    }
    
}
