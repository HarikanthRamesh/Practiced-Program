public class diamond {
    public static void main(String args[]){
        int n=5;
        int row,col,s;

        for(row=1;row<2*n;row++){
            int totalcols=row>n ? 2*n-row: row;
            int noOfspace=n-totalcols;
            for(s=1;s<=noOfspace;s++){
                System.out.print(" ");
            }
            for(col=1;col<=totalcols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
