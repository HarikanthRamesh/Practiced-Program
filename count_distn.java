import java.util.*;
public class count_distn {
    public static void main(String args[]){
        int arr[]={2,1,2,3,4,1,3,5};
        int n=arr.length;
        int count=0;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);

        for(int i=0;i<n;i++){
            if(visited[i]==true)
            continue;

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                }
            }
            count+=1;
    }
    System.out.println("NO OF DISTNCT ELEMENTS:"+count);
}
}
