package array_programs;
import java.util.*;

public class SmallLarge {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={45,5,47,21,13};
        int n=arr.length;
        int lar=arr[0];
        int small=arr[0];
        for(int i=0;i<n;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("Largest: "+lar+" Smallest: "+small);
    }
    
}
