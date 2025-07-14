public class num_tri {
    public static void main(String args[]){
        int n=5;
        int row,col,s;

        for(row=1;row<=n;row++){
            for(s=1;s<=n-row;s++){
                System.out.print("  ");
            }

            for(col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
                    
        }
    }
}
