// Here We are Gonna Print the Top  k Times Appearing Elements;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;
public class Numerical2 {
    static class Pair implements Comparable<Pair>{
        int x;int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair p2){
            return this.x-p2.x;
        }
    }
    
    public static  void Frequent(PriorityQueue<Pair>MinHeap,HashMap<Integer,Integer>map,int arr[],int k){
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0 )+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            MinHeap.add(new Pair(entry.getValue(), entry.getKey()));
            if(MinHeap.size()>k){
                MinHeap.remove();
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={1,1,1,3,2,2,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Pair> MinHeap=new PriorityQueue<>();
        int k=2;
        Frequent(MinHeap,map,arr,k);
        while(!MinHeap.isEmpty()){
            System.out.println(MinHeap.peek().y);
            MinHeap.remove();
        }
        
        
    }
    
}
