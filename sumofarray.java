package array_programs;

public class sumofarray {
    public static void main(String args[]){
            int arr[]={2,3,44,5};
            int n=arr.length;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            System.out.println("SUM: "+sum);
    }
}
