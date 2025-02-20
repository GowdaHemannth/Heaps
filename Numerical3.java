public class Numerical3 {
    public static int Large(int arr[],int l,int p){
        int n=arr.length;
        int Min=Integer.MAX_VALUE;
        int Sum=0;
         l=0;
         p=0;

        while(l<n){
            if(l==p){
                l++;
                Min=Math.min(Min, Sum);
                Sum=0;
            }
            
          Sum=Sum+arr[p];
          p++;
          p=p%n;

        }
        return Sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(Large(arr, 0, 0));


    }
    
}
