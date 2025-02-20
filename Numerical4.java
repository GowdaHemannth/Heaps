import java.util.Comparator;
import java.util. PriorityQueue;
// Here WE are Going to Find The Smallest Elemnt in the Arrya with Time Complexity nlognk;
public class Numerical4 {
    public static  int Largest(PriorityQueue<Integer>MaxHeap, int arr[],int k){
        for (int i=0;i<arr.length;i++){
            MaxHeap.add(arr[i]);
            if(MaxHeap.size()>k){
                MaxHeap.remove();
            }
        }
        return MaxHeap.peek();

    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        PriorityQueue<Integer>MaxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println(Largest(MaxHeap, arr, k));
    }
    
}
