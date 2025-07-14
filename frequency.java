
import java.util.*;
public class frequency{
    public static void main(String args[]){
        int arr[]={2,3,41,22,3,4,2};
        int n=arr.length;
        int freq;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true)
            continue;

            freq=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    freq++;
                }
            }
            System.out.println(arr[i]+" occurs "+freq+" times ");
            
        }
    }

}