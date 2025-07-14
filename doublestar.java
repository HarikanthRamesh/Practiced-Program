public class doublestar {

    public static void main(String args[]){
        int n=5;
        int row,col;
        for(row=1;row<2*n;row++) // 2*n --> rows are doubled
        {
            int totalcols= row > n ? 2*n -row : row; // when row crosses the n->4 value 2*n-row i.e(8-5==3). 
            for(col=1  ; col<=totalcols ; col++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    
