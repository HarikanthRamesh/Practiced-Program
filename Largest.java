package array_programs;
import java.util.*;
public class Largest {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={2,3,6,7,11,8};
        int n=arr.length;
        int larg=arr[0];
        for(int i=0;i<n;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
        }
        System.out.println("Largest:"+larg);
    }
}
