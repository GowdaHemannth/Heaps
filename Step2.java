import java.util.Comparator;
import java.util.PriorityQueue;
public class Step2 {
    static class Student implements Comparable<Student>{
        String Name;
        int Rank;
        public Student(String Name,int Rank){
            this.Name=Name;
            this.Rank=Rank;
        }
        @Override
        public int compareTo(Student s2){
          return  this.Rank-s2.Rank;
        }
    }
    public static void main(String[]args){
          PriorityQueue<Student>PQ=new PriorityQueue<>();
          PQ.add(new Student("A",15));
          PQ.add(new Student("B",18));
          PQ.add(new Student("C",21));
          PQ.add(new Student("D",30));
          PQ.add(new Student("E",28));
          while(!PQ.isEmpty()){
            System.out.println(PQ.peek().Name + " The rank is" + PQ.peek().Rank);
            PQ.remove();
          }


    }

    
}
