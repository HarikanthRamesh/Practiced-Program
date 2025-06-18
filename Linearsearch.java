import java.util.*;
public class linear {
     static int lin(int arr[], int n, int target){

        for(int i=0;i<n;i++){
            if(arr[i] == target){
                 return i+1;
            }
        }
        return -1;
     }

     public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();

        int result=lin(arr, n, target);
        if(result==-1)
            System.out.println("Elements not found!");
        else
            System.out.println(result);
     }
    
}
