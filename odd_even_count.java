public class odd_even_count {
    public static void main(String args[]){
        int arr[]={12,45,47,44,11,23};
        int n=arr.length;
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0)
                odd+=1;
            else 
                even+=1;
        }
        System.out.println("ODD CNT: "+odd+" EVEN CNT: "+even);
    }
}
