package array_programs;
import java.util.*;

public class second_large {
    // public static void main(String args[]){
    //     Scanner s=new Scanner(System.in);
    //     int arr[]={6,7,4,12,3,11};
    //     int n=arr.length;
    //     int small=arr[0];
    //     for(int i=0;i<n;i++){
    //         if(small>arr[i]){
    //             small=arr[i];
    //         }
    //     }
    //     int sec=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=small && arr[i]<sec)
    //             sec=arr[i];
    //     }
    //     System.out.println("SECOND SMALLEST:"+sec);
    // }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={6,7,4,12,3,11};
        int n=arr.length;
        int larg=arr[0];
        for(int i=0;i<n;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
        }
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=larg && arr[i]>sec)
                sec=arr[i];
        }
        System.out.println("SECOND LARGEST:"+sec);
    }
}
