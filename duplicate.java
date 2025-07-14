import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    public static void main(String args[]){
        int arr[]={1,234,56,56};
        int n=arr.length;
        int count=0;
         boolean visited[]=new boolean[n];
         Arrays.fill(visited,false);

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
            System.out.println(arr[i]+" ");
        }
    }
}

}
