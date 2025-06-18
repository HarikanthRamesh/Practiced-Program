import java.util.*;
public class Twisted_prime{

    static boolean isPrime(int a){
         if(a<2) return false; 
         for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)
                return false;
         }
         return true;
    }

    static boolean isTwistedPrime(int n){
        int rev=0;
        int n1=n,rem;

        while(n1>0){
            rem=n1%10;
            rev=(rev*10)+rem;
            n1/=10;
        }
        return isPrime(rev);
        
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isPrime(n)){
            System.out.println("Prime!");
            if(isTwistedPrime(n))
            {
                System.out.println("Twisted Prime");
            }
            else{
                System.out.println("Not a Twisted Prime");
            }
        }
        else{
            System.out.println("Not a Prime!");
        }
    }
}
