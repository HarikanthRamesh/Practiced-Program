package array_programs;
import java.util.*;
public class asc_desc_array {
    public static void main(String args[]){
        int arr[]={2,3,4,11,22,33};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
