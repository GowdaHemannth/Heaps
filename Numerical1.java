// Here We are Going to Find the Closest To the Elements And Return That ;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Numerical1 {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair p2){
            return this.x-p2.x;
        }

    }
    public static void Closest(PriorityQueue<Pair>MaxHeap,int arr[],int k){
        for(int i=0;i <arr.length;i++){
            MaxHeap.add(new Pair(Math.abs(arr[i] - k), arr[i]));
           if(MaxHeap.size()>3){
            MaxHeap.remove();
           }
            
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Pair>MaxHeap=new PriorityQueue<>((a,b)->b.x-a.x);
        int arr[]={5,6,7,10,8,9};
        int k=7;
        Closest(MaxHeap, arr, k);
        while(!MaxHeap.isEmpty()){
            System.out.println(MaxHeap.peek().y);
            MaxHeap.remove();
        }
    }
    
}
