import java.util.*;
public class repeating {
    public static void main(String args[]){
        int arr[]={23,1,3,23,3,4};
        int n=arr.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==true)
            continue;
            count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count!=1){
                System.out.println(arr[i]);
            }
        }
    }
    
}
