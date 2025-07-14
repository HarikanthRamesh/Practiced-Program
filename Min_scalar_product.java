import java.util.Arrays;

public class Min_scalar_product {
    public static void main(String args[]){
        int arr1[]={10,40,25,30};
        int arr2[]={2,3,1,4};
        int n=arr1.length;
        int product=0;
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]<arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
         }

         Arrays.sort(arr2);

         for(int i=0;i<n;i++){
            product=product+(arr1[i]*arr2[i]);
         }
         System.out.print(product);
    }
}
