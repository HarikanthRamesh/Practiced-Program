import java.util.*;
public class binary {
        static int bin(int arr[], int target){
            int low=0;
            int high=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==target)
                return mid+1;
            if (arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;

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

        int result=bin(arr,target);

        if(result==-1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println(result);
        }
    }
}
