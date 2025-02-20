import java.util.ArrayList;

public class Step4 {
    // In these We are going to How can we Delete Element from an Heap

    static class Heap{
      
        ArrayList<Integer>AL=new ArrayList<>();

       public void Delete(){
        // 1st step SWAP 1st Elemwnt with Last Element 
        int Data=AL.get(0);
        // Swapping With First And Last Element 
        int Temp=AL.get(0);
        AL.set(0, (AL.size()-1));
        AL.set(AL.size()-1, Temp);
      
        // 2nd Step is to Delete Elemnt from Last Position
        AL.remove(AL.size()-1);
       }
       // 3rd Step is to Perform hEapify
       private void Heapify(int i){
        int Left=2*i+1;
        int Right=2*i+2;
        int MidIdX=i;
        if(Left<AL.size()&&AL.get(Left)<AL.get(MidIdX)){
            MidIdX=Left;
        }

        if(Right<AL.size()&&AL.get(Left)<AL.get(MidIdX)){
            MidIdX=Right;
        }
 
         if(MidIdX!=i){
            int Temp=i;
            AL.set(i, AL.get(MidIdX));
            AL.set(MidIdX, AL.get(i));
            Heapify(MidIdX);
         }    

       }

        }
    
    public static void main(String [] args){
        //
    }
    
}
