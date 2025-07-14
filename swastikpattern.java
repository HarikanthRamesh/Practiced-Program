public class swastikpattern {
    public static void main(String args[]){
            int n=5;
            int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(j==n/2 || i==n/2 || j==0 && i<=n/2 || j==n-1 && i>=n/2 || i==4 && i<=n/2 || i==0 && i>=n/2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
}

    
    
}
