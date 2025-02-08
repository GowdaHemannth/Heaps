import java.util.Comparator;
import java.util.PriorityQueue;
public class Step1{
    public static void main(String[]args){
        // Here if You want to reverse Order of tehb PRiority Queue
        PriorityQueue<Integer>PQ=new PriorityQueue<>(Comparator.reverseOrder());
        PQ.add(5);
        PQ.add(4);
        PQ.add(3);
        PQ.add(2);
        PQ.add(1);
        while(!PQ.isEmpty()){
            System.out.println(PQ.peek());
            PQ.remove();
        }
    }
}