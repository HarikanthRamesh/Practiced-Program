public class triangle {
    public static void main(String args[]){
        int n=5;
        int row,col,s;

        for(row=1;row<=n;row++){
            int totalcols=row;
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
