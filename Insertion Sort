import java.util.Scanner;

public class insertion {
    static void insert(int arr[], int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int fst=i-1;

            while(fst>=0 && arr[fst]>key){
                arr[fst+1]=arr[fst];
                fst=fst-1;
            }
            arr[fst+1]=key;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        insert(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

