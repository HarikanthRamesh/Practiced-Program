import java.util.HashSet;
import java.util.Set;

public class removeduplicates {
    public static void main(String args[]){
        int arr[]={2,23,22,22,2,4,5};
        int n=arr.length;
        
        Set<Integer> hash=new HashSet<>();
         for(int i=0;i<n;i++){
            hash.add(arr[i]);
         }
         for(int i:hash){
            System.out.print(i+" ");
         }
    }
}
