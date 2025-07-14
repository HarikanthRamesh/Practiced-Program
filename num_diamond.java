public class num_diamond {

    public static void main(String args[]){
        int n=5;
        int row,col,s;

        for(row=1;row<n*2;row++){
            int totalcols=row>n ? 2*n-row:row;
            int space=n-totalcols;
            for(s=1;s<=space;s++){
                System.out.print("  ");
            }

            for(col=totalcols;col>=1;col--){
                System.out.print(col+" ");
            }
            for(col=2;col<=totalcols;col++){
                System.out.print(col+" ");
            }
            System.out.println();
                    
        }
    }
}
