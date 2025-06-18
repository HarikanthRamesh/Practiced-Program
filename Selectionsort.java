import java.util.Scanner;

public class selection {
    static void sort(int arr[], int n){
        int temp,min_idx;
        for(int i=0;i<n-1;i++){
            min_idx= i;
            for(int j=i+1;j<n;j++){
                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
