public class longest_palindrome {
    static boolean isPalin(int n){
            int n1=n;
            int rem,rev=0;
            while(n1!=0){
                rem=n1%10;
                rev=(rev*10)+rem;
                n1/=10;
            }
            if(rev==n){
                return true;
            }
            else{
                return false;
            }
        }
    public static void main(String args[]){
        int arr[]={212,333,423324,5655};
        int n=arr.length;

        int res=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>res && isPalin(arr[i]))
            res=arr[i];
        }
        System.out.println(res);
    }
}
